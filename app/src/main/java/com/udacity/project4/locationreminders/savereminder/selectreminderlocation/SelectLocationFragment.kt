package com.udacity.project4.locationreminders.savereminder.selectreminderlocation


import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Resources
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.*
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PointOfInterest
import com.google.android.material.snackbar.Snackbar
import com.udacity.project4.BuildConfig
import com.udacity.project4.R
import com.udacity.project4.base.BaseFragment
import com.udacity.project4.base.NavigationCommand
import com.udacity.project4.databinding.FragmentSelectLocationBinding
import com.udacity.project4.locationreminders.savereminder.*
import com.udacity.project4.utils.setDisplayHomeAsUpEnabled
import org.koin.android.ext.android.inject
import java.util.*

class SelectLocationFragment : BaseFragment(), OnMapReadyCallback {

    //Use Koin to get the view model of the SaveReminder
    override val _viewModel: SaveReminderViewModel by inject()
    private lateinit var binding: FragmentSelectLocationBinding
    private lateinit var map: GoogleMap
    private  var poiObject:PointOfInterest?=null
    private val randomLocationName="Random Location"
    private var randomLatLong:LatLng?=null
    private val TAG = "SelectLocationFragment"

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_select_location, container, false)

        binding.viewModel = _viewModel
        binding.lifecycleOwner = this

        setHasOptionsMenu(true)
        setDisplayHomeAsUpEnabled(true)
//        : add the map setup implementation
        val mapFragment=childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        fusedLocationProviderClient = this.requireContext().let { LocationServices.getFusedLocationProviderClient(it) }
        binding.btnSave.setOnClickListener {
            onLocationSelected()
        }
        return binding.root
    }

    private fun onLocationSelected() {
        //        : When the user confirms on the selected location,
        //         send back the selected location details to the view model
        //         and navigate back to the previous fragment to save the reminder and add the geofence
        if (poiObject==null){
            if (randomLatLong==null){
                _viewModel.showSnackBar.postValue(getString(R.string.err_select_location))
            }else{
                _viewModel.reminderSelectedLocationStr.postValue(randomLocationName)
                _viewModel.latitude.postValue(randomLatLong?.latitude)
                _viewModel.longitude.postValue(randomLatLong?.longitude)
                _viewModel.navigationCommand.postValue(NavigationCommand.Back)
            }
        }else{
            _viewModel.selectedPOI.postValue(poiObject)
            _viewModel.reminderSelectedLocationStr.postValue(poiObject?.name)
            _viewModel.latitude.postValue(poiObject?.latLng?.latitude)
            _viewModel.longitude.postValue(poiObject?.latLng?.longitude)
            _viewModel.navigationCommand.postValue(NavigationCommand.Back)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.map_options, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        // : Change the map type based on the user's selection.
        R.id.normal_map -> {
        map.mapType=GoogleMap.MAP_TYPE_NORMAL
            true
        }
        R.id.hybrid_map -> {
            map.mapType=GoogleMap.MAP_TYPE_HYBRID

            true
        }
        R.id.satellite_map -> {
            map.mapType=GoogleMap.MAP_TYPE_SATELLITE

            true
        }
        R.id.terrain_map -> {
            map.mapType=GoogleMap.MAP_TYPE_TERRAIN

            true
        }
        else -> super.onOptionsItemSelected(item)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map=googleMap
        enableLocation()
        setMapStyle(map)
        setPoiClick(map)
        map.setOnMapLongClickListener {
            randomLatLong=it
            val snippet = String.format(
                Locale.getDefault(),
                "Lat: %1$.5f, Long: %2$.5f",
                it.latitude,
                it.longitude
            )
            map.addMarker(
                MarkerOptions().position(it)
                    .title(getString(R.string.dropped_pin))
                    .snippet(snippet)
            )
        }

    }

    @SuppressLint("MissingPermission")
    private fun enableLocation() {
        if (isPermissionGranted()) {
            map.isMyLocationEnabled = true
            fusedLocationProviderClient.lastLocation.addOnSuccessListener(requireActivity()) { location ->
                if (location != null) {
                    val userLatLng = LatLng(location.latitude, location.longitude)
                    val zoomLevel = 15f
                    map.moveCamera(CameraUpdateFactory.newLatLngZoom(userLatLng, zoomLevel))
                }
            }
        } else {
            _viewModel.showErrorMessage.postValue(getString(R.string.err_select_location))
            var permissionsArray = arrayOf(Manifest.permission.ACCESS_FINE_LOCATION)
            val requestCode = REQUEST_ACCESS_FINE_PERMISSIONS_REQUEST_CODE
            requestPermissions(
                permissionsArray,
                requestCode
            )
        }

    }

    private fun isPermissionGranted() : Boolean {
        return ActivityCompat.checkSelfPermission(
            requireContext(),
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray) {
        // Check if location permissions are granted and if so enable the
        // location data layer.
        if (requestCode == REQUEST_ACCESS_FINE_PERMISSIONS_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && (grantResults[0] != PackageManager.PERMISSION_GRANTED)) {
                Snackbar.make(
                    binding.selectFragmentRoot,
                    R.string.permission_denied_explanation,
                    Snackbar.LENGTH_LONG
                )
                    .setAction(R.string.settings) {
                        startActivity(Intent().apply {
                            action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                            data = Uri.fromParts("package",BuildConfig.APPLICATION_ID, null)
                            flags = Intent.FLAG_ACTIVITY_NEW_TASK
                        })
                    }.show()
            }else if (grantResults.isNotEmpty()&&grantResults[0]==PackageManager.PERMISSION_GRANTED) {
                enableLocation()
            }
        }
    }







    private fun setMapStyle(map: GoogleMap) {
        try {
            val success: Boolean = map.setMapStyle(
                MapStyleOptions.loadRawResourceStyle(context, R.raw.mostafa_style)
            )
            if (!success) {
                Log.e(TAG, "style parsing failed.")
            }
        } catch (e: Resources.NotFoundException) {
            Log.e(TAG, "can't find the style .error", e)
        }
    }
    private fun setPoiClick(map: GoogleMap) {
        map.setOnPoiClickListener { poi ->
            map.clear()
            poiObject=poi
            val poiMarker = map.addMarker(
                MarkerOptions()
                    .position(poi.latLng)
                    .title(poi.name)
            )
            poiMarker.showInfoWindow()
        }

    }




}
private const val REQUEST_ACCESS_FINE_PERMISSIONS_REQUEST_CODE = 34
