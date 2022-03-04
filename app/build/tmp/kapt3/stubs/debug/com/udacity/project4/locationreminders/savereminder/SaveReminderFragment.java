package com.udacity.project4.locationreminders.savereminder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 A2\u00020\u0001:\u0001AB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003J\u0012\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\u0019H\u0003J\"\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020\u001bH\u0016J-\u00105\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020(2\u000e\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u000208072\u0006\u00109\u001a\u00020:H\u0016\u00a2\u0006\u0002\u0010;J\b\u0010<\u001a\u00020\u001bH\u0016J\u001a\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u0010?\u001a\u00020\u001bH\u0002J\b\u0010@\u001a\u00020\u001bH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/udacity/project4/locationreminders/savereminder/SaveReminderFragment;", "Lcom/udacity/project4/base/BaseFragment;", "()V", "_viewModel", "Lcom/udacity/project4/locationreminders/savereminder/SaveReminderViewModel;", "get_viewModel", "()Lcom/udacity/project4/locationreminders/savereminder/SaveReminderViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/udacity/project4/databinding/FragmentSaveReminderBinding;", "geofencePendingIntent", "Landroid/app/PendingIntent;", "getGeofencePendingIntent", "()Landroid/app/PendingIntent;", "geofencePendingIntent$delegate", "geofencingClient", "Lcom/google/android/gms/location/GeofencingClient;", "reminderDataItem", "Lcom/udacity/project4/locationreminders/reminderslist/ReminderDataItem;", "getReminderDataItem", "()Lcom/udacity/project4/locationreminders/reminderslist/ReminderDataItem;", "setReminderDataItem", "(Lcom/udacity/project4/locationreminders/reminderslist/ReminderDataItem;)V", "runningQOrLater", "", "addGeofence", "", "geofenceRequest", "Lcom/google/android/gms/location/GeofencingRequest;", "checkDeviceLocationSettingsAndStartGeofences", "resolve", "checkPermissions_And_LocationSettings", "createGeofence", "Lcom/google/android/gms/location/Geofence;", "createGeofenceRequest", "geofence", "foregroundAndBackgroundLocationPermissionApproved", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "onViewCreated", "view", "requestPermissions", "showSnackBar", "Companion", "app_debug"})
public final class SaveReminderFragment extends com.udacity.project4.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _viewModel$delegate = null;
    private com.udacity.project4.databinding.FragmentSaveReminderBinding binding;
    private com.google.android.gms.location.GeofencingClient geofencingClient;
    @org.jetbrains.annotations.Nullable()
    private com.udacity.project4.locationreminders.reminderslist.ReminderDataItem reminderDataItem;
    private final boolean runningQOrLater = false;
    private final kotlin.Lazy geofencePendingIntent$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_GEOFENCE_EVENT = "SaveReminderFragment.geofenceAction";
    public static final com.udacity.project4.locationreminders.savereminder.SaveReminderFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.udacity.project4.locationreminders.savereminder.SaveReminderViewModel get_viewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.udacity.project4.locationreminders.reminderslist.ReminderDataItem getReminderDataItem() {
        return null;
    }
    
    public final void setReminderDataItem(@org.jetbrains.annotations.Nullable()
    com.udacity.project4.locationreminders.reminderslist.ReminderDataItem p0) {
    }
    
    private final android.app.PendingIntent getGeofencePendingIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkPermissions_And_LocationSettings() {
    }
    
    private final void requestPermissions() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void checkDeviceLocationSettingsAndStartGeofences(boolean resolve) {
    }
    
    private final com.google.android.gms.location.GeofencingRequest createGeofenceRequest(com.google.android.gms.location.Geofence geofence) {
        return null;
    }
    
    private final com.google.android.gms.location.Geofence createGeofence(com.udacity.project4.locationreminders.reminderslist.ReminderDataItem reminderDataItem) {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.Q)
    private final boolean foregroundAndBackgroundLocationPermissionApproved() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void addGeofence(com.google.android.gms.location.GeofencingRequest geofenceRequest) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void showSnackBar() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public SaveReminderFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/udacity/project4/locationreminders/savereminder/SaveReminderFragment$Companion;", "", "()V", "ACTION_GEOFENCE_EVENT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}