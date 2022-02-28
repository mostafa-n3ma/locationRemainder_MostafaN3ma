package com.udacity.project4.locationreminders.reminderslist

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.project4.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class ReminderListFragmentDirections private constructor() {
  private data class ActionReminderListFragmentToReminderDescriptionActivity2(
    val reminderdataitem: ReminderDataItem
  ) : NavDirections {
    override fun getActionId(): Int =
        R.id.action_reminderListFragment_to_reminderDescriptionActivity2

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(ReminderDataItem::class.java)) {
        result.putParcelable("reminderdataitem", this.reminderdataitem as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(ReminderDataItem::class.java)) {
        result.putSerializable("reminderdataitem", this.reminderdataitem as Serializable)
      } else {
        throw UnsupportedOperationException(ReminderDataItem::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun toSaveReminder(): NavDirections = ActionOnlyNavDirections(R.id.to_save_reminder)

    fun actionReminderListFragmentToReminderDescriptionActivity2(reminderdataitem: ReminderDataItem):
        NavDirections = ActionReminderListFragmentToReminderDescriptionActivity2(reminderdataitem)
  }
}
