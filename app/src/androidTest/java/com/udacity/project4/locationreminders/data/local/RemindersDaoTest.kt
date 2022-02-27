package com.udacity.project4.locationreminders.data.local

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SmallTest;
import com.udacity.project4.locationreminders.data.dto.ReminderDTO

import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.notNullValue
import org.hamcrest.MatcherAssert.assertThat
import org.junit.After
import org.junit.Test

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
//Unit test the DAO
@SmallTest
class RemindersDaoTest {

//    TODO: Add testing implementation to the RemindersDao.kt

    private lateinit var database: RemindersDatabase
    private lateinit var dao: RemindersDao

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun createDatabase() {
    database=Room.inMemoryDatabaseBuilder(
        ApplicationProvider.getApplicationContext(),
        RemindersDatabase::class.java
    ).build()
        dao=database.reminderDao()
    }

    @After
    fun closeDatabase()=database.close()


    @Test
    fun insertReminder_getReminder()= runBlockingTest{
        //Given ReminderDTO
        val reminder=ReminderDTO("Mostafa","Description","Location",567892.0,3594687.0)

        //When Inserting The Reminder
        dao.saveReminder(reminder)

        //Then check the Inserted Reminder
        val loadedReminder=dao.getReminderById(reminder.id)
        assertThat(loadedReminder, `is`(reminder))

    }


    @Test
    fun addReminders_getAllReminders()= runBlockingTest {
        //Given list of Reminders
        val remindersList:List<ReminderDTO> = listOf(
            ReminderDTO("Mostafa","Description","Location",567892.0,3594687.0),
            ReminderDTO("Mostafa","Description","Location",567892.0,3594687.0),
            ReminderDTO("Mostafa","Description","Location",567892.0,3594687.0),
            ReminderDTO("Mostafa","Description","Location",567892.0,3594687.0)
        )
        for (reminder in remindersList){
            dao.saveReminder(reminder)
        }

        //when loading from database
        val loadedReminders: List<ReminderDTO> =dao.getReminders()

        //Then check the loaded list is equal to the first one
        assertThat(loadedReminders, `is`(remindersList))
    }


    @Test
    fun addReminders_deleteAll()= runBlockingTest{
        //Given list of Reminders
        val remindersList:List<ReminderDTO> = listOf(
            ReminderDTO("Mostafa","Description","Location",567892.0,3594687.0),
            ReminderDTO("Mostafa","Description","Location",567892.0,3594687.0),
            ReminderDTO("Mostafa","Description","Location",567892.0,3594687.0),
            ReminderDTO("Mostafa","Description","Location",567892.0,3594687.0)
        )
        for (reminder in remindersList){
            dao.saveReminder(reminder)
        }
        //When deleting all
        dao.deleteAllReminders()
        val loadedReminders: List<ReminderDTO> =dao.getReminders()

        //Then the list loaded is empty
        assertThat(loadedReminders.size, `is`(0))
    }

}