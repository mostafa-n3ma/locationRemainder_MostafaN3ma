package com.udacity.project4.authentication

import androidx.lifecycle.LiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class FirebaseLiveData: LiveData<FirebaseUser?>() {

private val firebaseAuth=FirebaseAuth.getInstance()

    private val authStateListener=FirebaseAuth.AuthStateListener { firebaseAuth ->
        value=firebaseAuth.currentUser
    }
    override fun onActive() {
        firebaseAuth.addAuthStateListener(authStateListener)
    }

    // When this object no longer has an active observer, stop observing the FirebaseAuth state to
    // prevent memory leaks.
    override fun onInactive() {
        firebaseAuth.removeAuthStateListener(authStateListener)
    }
}