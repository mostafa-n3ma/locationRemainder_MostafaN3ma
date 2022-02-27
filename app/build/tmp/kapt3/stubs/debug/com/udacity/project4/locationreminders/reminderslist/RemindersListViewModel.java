package com.udacity.project4.locationreminders.reminderslist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/udacity/project4/locationreminders/reminderslist/RemindersListViewModel;", "Lcom/udacity/project4/base/BaseViewModel;", "app", "Landroid/app/Application;", "dataSource", "Lcom/udacity/project4/locationreminders/data/ReminderDataSource;", "(Landroid/app/Application;Lcom/udacity/project4/locationreminders/data/ReminderDataSource;)V", "isLogin", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "remindersList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/udacity/project4/locationreminders/reminderslist/ReminderDataItem;", "getRemindersList", "()Landroidx/lifecycle/MutableLiveData;", "invalidateShowNoData", "", "loadReminders", "app_debug"})
public final class RemindersListViewModel extends com.udacity.project4.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.udacity.project4.locationreminders.reminderslist.ReminderDataItem>> remindersList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLogin = null;
    private final com.udacity.project4.locationreminders.data.ReminderDataSource dataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.udacity.project4.locationreminders.reminderslist.ReminderDataItem>> getRemindersList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLogin() {
        return null;
    }
    
    /**
     * Get all the reminders from the DataSource and add them to the remindersList to be shown on the UI,
     * or show error if any
     */
    public final void loadReminders() {
    }
    
    /**
     * Inform the user that there's not any data if the remindersList is empty
     */
    private final void invalidateShowNoData() {
    }
    
    public RemindersListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.udacity.project4.locationreminders.data.ReminderDataSource dataSource) {
        super(null);
    }
}