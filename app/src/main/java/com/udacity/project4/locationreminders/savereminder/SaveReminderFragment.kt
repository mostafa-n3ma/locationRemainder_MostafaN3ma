package com.udacity.project4.locationreminders.savereminder

import android.Manifest
import android.annotation.TargetApi
import android.app.PendingIntent
import android.content.Intent
import android.content.IntentSender
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.google.android.material.snackbar.Snackbar
import com.udacity.project4.BuildConfig
import com.udacity.project4.R
import com.udacity.project4.base.BaseFragment
import com.udacity.project4.base.NavigationCommand
import com.udacity.project4.databinding.FragmentSaveReminderBinding
import com.udacity.project4.locationreminders.geofence.GeofenceBroadcastReceiver
import com.udacity.project4.locationreminders.reminderslist.ReminderDataItem
import com.udacity.project4.utils.setDisplayHomeAsUpEnabled
import org.koin.android.ext.android.inject

class SaveReminderFragment : BaseFragment() {
    //Get the view model this time as a single to be shared with the another fragment
    override val _viewModel: SaveReminderViewModel by inject()
    private lateinit var binding: FragmentSaveReminderBinding
    private lateinit var geofencingClient: GeofencingClient
    var reminderDataItem: ReminderDataItem? = null
    private val runningQOrLater =
        android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q

    companion object {
        internal const val ACTION_GEOFENCE_EVENT = "SaveReminderFragment.geofenceAction"
    }

    private val geofencePendingIntent: PendingIntent by lazy {
        val intent = Intent(requireContext(), GeofenceBroadcastReceiver::class.java)
        intent.action = ACTION_GEOFENCE_EVENT
        PendingIntent.getBroadcast(requireContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_save_reminder, container, false)

        setDisplayHomeAsUpEnabled(true)

        binding.viewModel = _viewModel

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = this
        geofencingClient = LocationServices.getGeofencingClient(requireActivity())

        binding.selectLocation.setOnClickListener {
            if (locationPermissionIsGranted()){
                _viewModel.navigationCommand.value =
                    NavigationCommand.To(SaveReminderFragmentDirections.actionSaveReminderFragmentToSelectLocationFragment())
            }else{
                showSnackBar()
            }

        }
        Log.i(TAG, "onViewCreated: called")

        binding.saveReminder.setOnClickListener {
            val title = _viewModel.reminderTitle.value
            val description = _viewModel.reminderDescription.value
            val location = _viewModel.reminderSelectedLocationStr.value
            val latitude = _viewModel.latitude.value
            val longitude = _viewModel.longitude.value
            reminderDataItem = ReminderDataItem(title, description, location, latitude, longitude)
            if (reminderDataItem!!.latitude == null || reminderDataItem!!.longitude == null || reminderDataItem!!.location == null || reminderDataItem!!.title == null || reminderDataItem!!.description == null) {
                Toast.makeText(
                    requireContext(),
                    "please choose a Location first ",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            try {
                _viewModel.validateAndSaveReminder(reminderDataItem!!)
            } finally {
                initGeofence(reminderDataItem!!)
            }

//            : use the user entered reminder details to:
//             1) add a geofencing request
//             2) save the reminder to the local db
        }
    }


    private fun initGeofence(reminderDataItem: ReminderDataItem) {
        val geofence = createGeofence(reminderDataItem)
        val geofenceRequest = createGeofenceRequest(geofence)
        AddGeofence(geofenceRequest)
    }

    private fun createGeofenceRequest(geofence: Geofence): GeofencingRequest {
        return GeofencingRequest.Builder()
            .setInitialTrigger(0)
            .addGeofence(geofence)
            .build()
    }

    private fun createGeofence(reminderDataItem: ReminderDataItem): Geofence {
        return Geofence.Builder()
            .setRequestId(reminderDataItem.id)
            .setCircularRegion(
                reminderDataItem.latitude!!, reminderDataItem.longitude!!,
                200f
            )
            .setExpirationDuration(Geofence.NEVER_EXPIRE)
            .setTransitionTypes(Geofence.GEOFENCE_TRANSITION_ENTER)
            .build()
    }


    private fun AddGeofence(geofenceRequest: GeofencingRequest) {
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            Log.e(TAG, "AddGeofence: failed")
            return
        }
        geofencingClient.addGeofences(geofenceRequest, geofencePendingIntent)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.i("geofencingClient", " geofence added successfully ")
                }

            }
            .addOnFailureListener {
                Log.e("geofencingClient", it.toString())
            }
    }

    override fun onDestroy() {
        super.onDestroy()
        //make sure to clear the view model after destroy, as it's a single view model.
        _viewModel.onClear()
    }

    override fun onStart() {
        super.onStart()
    }

    private fun locationPermissionIsGranted(): Boolean {
        return ActivityCompat.checkSelfPermission(
            requireContext(),
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    }

    private fun showSnackBar() {
        Snackbar.make(
            requireView(),
            R.string.permission_denied_explanation, Snackbar.LENGTH_INDEFINITE
        )
            .setAction(R.string.settings) {
                // Displays App settings screen.
                startActivity(Intent().apply {
                    action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                    data = Uri.fromParts("package", BuildConfig.APPLICATION_ID, null)
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK
                })
            }.show()
    }
}

private const val REQUEST_FOREGROUND_AND_BACKGROUND_PERMISSION_RESULT_CODE = 33
private const val REQUEST_FOREGROUND_ONLY_PERMISSIONS_REQUEST_CODE = 34
private const val REQUEST_TURN_DEVICE_LOCATION_ON = 29
private const val TAG = "SaveReminderFragment"
private const val LOCATION_PERMISSION_INDEX = 0
private const val BACKGROUND_LOCATION_PERMISSION_INDEX = 1


//
//Snackbar.make(
//requireView(),
//R.string.permission_denied_explanation, Snackbar.LENGTH_INDEFINITE
//)
//.setAction(R.string.settings) {
//    // Displays App settings screen.
//    startActivity(Intent().apply {
//        action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
//        data = Uri.fromParts("package", BuildConfig.APPLICATION_ID, null)
//        flags = Intent.FLAG_ACTIVITY_NEW_TASK
//    })
//}.show()