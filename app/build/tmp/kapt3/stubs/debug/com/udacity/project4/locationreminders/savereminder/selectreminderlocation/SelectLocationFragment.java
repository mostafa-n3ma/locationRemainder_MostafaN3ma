package com.udacity.project4.locationreminders.savereminder.selectreminderlocation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001e\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u0018H\u0002J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0011H\u0016J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0016J+\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u0005012\u0006\u00102\u001a\u000203H\u0016\u00a2\u0006\u0002\u00104J\u0010\u00105\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u00106\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/udacity/project4/locationreminders/savereminder/selectreminderlocation/SelectLocationFragment;", "Lcom/udacity/project4/base/BaseFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "TAG", "", "_viewModel", "Lcom/udacity/project4/locationreminders/savereminder/SaveReminderViewModel;", "get_viewModel", "()Lcom/udacity/project4/locationreminders/savereminder/SaveReminderViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/udacity/project4/databinding/FragmentSelectLocationBinding;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "poiObject", "Lcom/google/android/gms/maps/model/PointOfInterest;", "randomLatLong", "Lcom/google/android/gms/maps/model/LatLng;", "randomLocationName", "enableLocation", "", "isPermissionGranted", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLocationSelected", "onMapReady", "googleMap", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setMapStyle", "setPoiClick", "app_debug"})
public final class SelectLocationFragment extends com.udacity.project4.base.BaseFragment implements com.google.android.gms.maps.OnMapReadyCallback {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _viewModel$delegate = null;
    private com.udacity.project4.databinding.FragmentSelectLocationBinding binding;
    private com.google.android.gms.maps.GoogleMap map;
    private com.google.android.gms.maps.model.PointOfInterest poiObject;
    private final java.lang.String randomLocationName = "Random Location";
    private com.google.android.gms.maps.model.LatLng randomLatLong;
    private final java.lang.String TAG = "SelectLocationFragment";
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.udacity.project4.locationreminders.savereminder.SaveReminderViewModel get_viewModel() {
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
    
    private final void onLocationSelected() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void enableLocation() {
    }
    
    private final boolean isPermissionGranted() {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void setMapStyle(com.google.android.gms.maps.GoogleMap map) {
    }
    
    private final void setPoiClick(com.google.android.gms.maps.GoogleMap map) {
    }
    
    public SelectLocationFragment() {
        super();
    }
}