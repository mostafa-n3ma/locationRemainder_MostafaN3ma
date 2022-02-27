package com.udacity.project4.locationreminders.savereminder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000f\u00a8\u0006$"}, d2 = {"Lcom/udacity/project4/locationreminders/savereminder/SaveReminderViewModel;", "Lcom/udacity/project4/base/BaseViewModel;", "app", "Landroid/app/Application;", "dataSource", "Lcom/udacity/project4/locationreminders/data/ReminderDataSource;", "(Landroid/app/Application;Lcom/udacity/project4/locationreminders/data/ReminderDataSource;)V", "getApp", "()Landroid/app/Application;", "getDataSource", "()Lcom/udacity/project4/locationreminders/data/ReminderDataSource;", "latitude", "Landroidx/lifecycle/MutableLiveData;", "", "getLatitude", "()Landroidx/lifecycle/MutableLiveData;", "longitude", "getLongitude", "reminderDescription", "", "getReminderDescription", "reminderSelectedLocationStr", "getReminderSelectedLocationStr", "reminderTitle", "getReminderTitle", "selectedPOI", "Lcom/google/android/gms/maps/model/PointOfInterest;", "getSelectedPOI", "onClear", "", "saveReminder", "reminderData", "Lcom/udacity/project4/locationreminders/reminderslist/ReminderDataItem;", "validateAndSaveReminder", "validateEnteredData", "", "app_debug"})
public final class SaveReminderViewModel extends com.udacity.project4.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> reminderTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> reminderDescription = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> reminderSelectedLocationStr = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.android.gms.maps.model.PointOfInterest> selectedPOI = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> latitude = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> longitude = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.project4.locationreminders.data.ReminderDataSource dataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getReminderTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getReminderDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getReminderSelectedLocationStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.android.gms.maps.model.PointOfInterest> getSelectedPOI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getLatitude() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getLongitude() {
        return null;
    }
    
    /**
     * Clear the live data objects to start fresh next time the view model gets called
     */
    public final void onClear() {
    }
    
    /**
     * Validate the entered data then saves the reminder data to the DataSource
     */
    public final void validateAndSaveReminder(@org.jetbrains.annotations.NotNull()
    com.udacity.project4.locationreminders.reminderslist.ReminderDataItem reminderData) {
    }
    
    /**
     * Save the reminder to the data source
     */
    public final void saveReminder(@org.jetbrains.annotations.NotNull()
    com.udacity.project4.locationreminders.reminderslist.ReminderDataItem reminderData) {
    }
    
    /**
     * Validate the entered data and show error to the user if there's any invalid data
     */
    public final boolean validateEnteredData(@org.jetbrains.annotations.NotNull()
    com.udacity.project4.locationreminders.reminderslist.ReminderDataItem reminderData) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.project4.locationreminders.data.ReminderDataSource getDataSource() {
        return null;
    }
    
    public SaveReminderViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.udacity.project4.locationreminders.data.ReminderDataSource dataSource) {
        super(null);
    }
}