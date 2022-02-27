package com.udacity.project4.locationreminders.reminderslist

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.project4.R

class ReminderListFragmentDirections private constructor() {
  companion object {
    fun toSaveReminder(): NavDirections = ActionOnlyNavDirections(R.id.to_save_reminder)
  }
}
