package com.udacity.project4.locationreminders.savereminder.selectreminderlocation

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.project4.R

class SelectLocationFragmentDirections private constructor() {
  companion object {
    fun actionSelectLocationFragmentToSaveReminderFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_selectLocationFragment_to_saveReminderFragment)
  }
}
