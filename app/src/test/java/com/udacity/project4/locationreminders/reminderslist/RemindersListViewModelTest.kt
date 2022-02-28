package com.udacity.project4.locationreminders.reminderslist

import android.os.Build
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.udacity.project4.locationreminders.MainCoroutineRule
import com.udacity.project4.locationreminders.data.FakeDataSource
import com.udacity.project4.locationreminders.getOrAwaitValue
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.MatcherAssert
import org.hamcrest.core.Is
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
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






}