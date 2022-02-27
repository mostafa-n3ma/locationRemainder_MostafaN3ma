package com.udacity.project4.authentication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.firebase.ui.auth.AuthMethodPickerLayout
import com.firebase.ui.auth.AuthUI
import com.udacity.project4.R
import com.udacity.project4.databinding.ActivityAuthenticationBinding
import com.udacity.project4.locationreminders.RemindersActivity


/**
 * This class should be the starting point of the app, It asks the users to sign in / register, and redirects the
 * signed in users to the RemindersActivity.
 */
class AuthenticationActivity : AppCompatActivity() {
    companion object {
        const val TAG = "AuthenticationActivity"
        const val SIGN_IN_RESULT_CODE = 1001
    }
private lateinit var binding:ActivityAuthenticationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_authentication)
        binding.buttonLogin.setOnClickListener {
            launchSignInUi()
        }
    }

    private fun launchSignInUi() {
        val customLayout = AuthMethodPickerLayout.Builder(R.layout.custom_signin_picker)
            .setGoogleButtonId(R.id.signin_google)
            .setEmailButtonId(R.id.signin_email)
            .build()

        val providers= arrayListOf(
            AuthUI.IdpConfig.EmailBuilder().build(),AuthUI.IdpConfig.GoogleBuilder().build()
        )
        startActivityForResult(
            AuthUI.getInstance().createSignInIntentBuilder()
                .setAuthMethodPickerLayout(customLayout)
                .setAvailableProviders(providers)
                .build(), SIGN_IN_RESULT_CODE
        )



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode== SIGN_IN_RESULT_CODE){
            if (resultCode==Activity.RESULT_OK){
                val intent=Intent(this,RemindersActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                Log.i(TAG, "onActivityResult: UnSuccessfully Login ")
            }
        }
    }
}
