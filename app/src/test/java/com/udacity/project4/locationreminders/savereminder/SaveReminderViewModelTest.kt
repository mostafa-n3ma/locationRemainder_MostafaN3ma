package com.udacity.project4.locationreminders.savereminder

import android.os.Build
import android.provider.Settings.System.getString
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.udacity.project4.R
import com.udacity.project4.base.NavigationCommand
import com.udacity.project4.locationreminders.MainCoroutineRule
import com.udacity.project4.locationreminders.data.FakeDataSource
import com.udacity.project4.locationreminders.getOrAwaitValue
import com.udacity.project4.locationreminders.reminderslist.ReminderDataItem

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.hamcrest.core.IsEqual
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.core.context.stopKoin
import org.robolectric.annotation.Config

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.P])
class SaveReminderViewModelTest {


    //TODO: provide testing to the SaveReminderView and its live data objects
    private lateinit var reminderViewModel: SaveReminderViewModel
    private lateinit var reminderRepository:FakeDataSource

    @get:Rule
    val instantTaskExecutorRule=InstantTaskExecutorRule()

    @get:Rule
    val mainCoroutineRule=MainCoroutineRule()

    @Before
    fun initViewModel(){
        reminderRepository= FakeDataSource()
        reminderViewModel= SaveReminderViewModel(ApplicationProvider.getApplicationContext(),reminderRepository)
        runBlocking {
            reminderRepository.deleteAllReminders()
        }
    }
    @After
    fun tearDown() {
        stopKoin()
    }


    @Test
    fun update_snackBar_empty_Title_input()=mainCoroutineRule.runBlockingTest{
        val reminder=ReminderDataItem("","description","location",564568.0,3594625.0)
        reminderViewModel.validateEnteredData(reminder)
        assertThat(reminderViewModel.validateEnteredData(reminder),`is`(false))
        assertThat(reminderViewModel.showSnackBarInt.getOrAwaitValue(),`is`(R.string.err_enter_title))
    }
    @Test
    fun update_snackBar_empty_Location_input()=mainCoroutineRule.runBlockingTest{
        val reminder=ReminderDataItem("Title","description","",564568.0,3594625.0)
        reminderViewModel.validateEnteredData(reminder)
        assertThat(reminderViewModel.validateEnteredData(reminder),`is`(false))
        assertThat(reminderViewModel.showSnackBarInt.getOrAwaitValue(),`is`(R.string.err_select_location))
    }

   @Test
   fun saveReminder_isSaved_loadingOff_displayToast_navigateBack()=mainCoroutineRule.runBlockingTest{
       val reminder=ReminderDataItem("Title","description","Location",564358.0,3593125.0)
       mainCoroutineRule.pauseDispatcher()
       reminderViewModel.saveReminder(reminder)

       assertThat(reminderViewModel.showLoading.getOrAwaitValue(),`is`(true) )
       mainCoroutineRule.resumeDispatcher()

       assertThat(reminderViewModel.showLoading.getOrAwaitValue(),`is`(false))
       assertThat(reminderViewModel.showToast.getOrAwaitValue(),`is`("Reminder Saved !"))


       val conformNavigationCommand:Boolean=reminderViewModel.navigationCommand.getOrAwaitValue()==NavigationCommand.Back
        assertThat(conformNavigationCommand, `is`(true))


   }





}