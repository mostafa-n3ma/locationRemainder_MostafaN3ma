package com.udacity.project4.locationreminders.reminderslist

import android.os.Build
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import com.udacity.project4.locationreminders.MainCoroutineRule
import com.udacity.project4.locationreminders.data.FakeDataSource
import com.udacity.project4.locationreminders.data.dto.ReminderDTO
import com.udacity.project4.locationreminders.getOrAwaitValue
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.core.context.stopKoin
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@ExperimentalCoroutinesApi
@Config(sdk = [Build.VERSION_CODES.P])
class RemindersListViewModelTest {

    //TODO: provide testing to the RemindersListViewModel and its live data objects
    private lateinit var reminderViewModel:RemindersListViewModel

    private lateinit var reminderRepository:FakeDataSource

    @get:Rule
    val instantTaskExecutorRule=InstantTaskExecutorRule()

    @get:Rule
    val mainCoroutineRule=MainCoroutineRule()

    @Before
    fun initViewModel(){
        reminderRepository= FakeDataSource()
        reminderViewModel= RemindersListViewModel(ApplicationProvider.getApplicationContext(),reminderRepository)
        runBlocking {
            reminderRepository.deleteAllReminders()
        }
    }
    @After
    fun tearDown() {
        stopKoin()
    }

    @Test
    fun loadingReminders_loading()=mainCoroutineRule.runBlockingTest{

        // GIVEN
        // pause dispatcher so you can verify initial values
        mainCoroutineRule.pauseDispatcher()

        // load the task from viewModel
        reminderViewModel.loadReminders()

        // THEN : Assert that progress indicator is shown
        MatcherAssert.assertThat(reminderViewModel.showLoading.getOrAwaitValue(), Is.`is`(true))

        // Execute pending coroutines actions.
        mainCoroutineRule.resumeDispatcher()

        MatcherAssert.assertThat(reminderViewModel.showLoading.getOrAwaitValue(), Is.`is`(false))

    }

    @Test
    fun unAvailableReminders_loadErrorMessage () = mainCoroutineRule.runBlockingTest{

        reminderRepository.setReturnError(true)

        reminderViewModel.loadReminders()

        assertThat(
            reminderViewModel.showSnackBar.getOrAwaitValue(),
            Is.`is`("Error getting reminders")
        )

    }

    @Test
    fun deleteReminder_check_if_list_isEmpty() = mainCoroutineRule.runBlockingTest {

        // Given
        reminderRepository.deleteAllReminders()

        // When
        reminderViewModel.loadReminders()

        // Then
        assertThat(reminderViewModel.showNoData.getOrAwaitValue(), Is.`is`(true))

    }

    @Test
    fun save_to_database_check_if_view_isNotEmpty() = mainCoroutineRule.runBlockingTest {

        val firstReminder = ReminderDTO(
            "Mostafa", "Nema", "Iraq", 568359.0, 3596487.0
        )

        reminderRepository.saveReminder(firstReminder)

        reminderViewModel.loadReminders()

        Truth.assertThat(reminderViewModel.remindersList.getOrAwaitValue().isNotEmpty())


    }

}