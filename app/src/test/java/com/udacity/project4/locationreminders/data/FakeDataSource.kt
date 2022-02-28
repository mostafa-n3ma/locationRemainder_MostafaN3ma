package com.udacity.project4.locationreminders.data

import com.udacity.project4.locationreminders.data.dto.ReminderDTO
import com.udacity.project4.locationreminders.data.dto.Result

//Use FakeDataSource that acts as a test double to the LocalDataSource
class FakeDataSource (var reminderList: MutableList<ReminderDTO>? = mutableListOf()): ReminderDataSource {


    private var shouldReturnError = false

    fun setReturnError(value: Boolean) {
        shouldReturnError = value
    }

    override suspend fun getReminders(): Result<List<ReminderDTO>> {

        if (shouldReturnError) {
            return Result.Error(
                "Error getting reminders"
            )
        }

        reminderList?.let {return Result.Success(ArrayList(it)) }

        return Result.Error("Reminder not found")

    }

    override suspend fun saveReminder(reminder: ReminderDTO) {
        reminderList?.add(reminder)
    }

    override suspend fun getReminder(id: String): Result<ReminderDTO> {

        // validate id
        val reminder = reminderList?.find { reminderDTO ->
            reminderDTO.id == id
        }

        return when {
            shouldReturnError -> {
                Result.Error("Error getting reminders")
            }
            reminder != null -> {
                Result.Success(reminder)
            }
            else -> {
                Result.Error("Reminder not found")
            }
        }
    }

    override suspend fun deleteAllReminders() {
        reminderList?.clear()
    }


}