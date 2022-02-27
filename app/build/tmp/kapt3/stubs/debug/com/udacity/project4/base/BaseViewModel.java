package com.udacity.project4.base;

import java.lang.System;

/**
 * Base class for View Models to declare the common LiveData objects in one place
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lcom/udacity/project4/base/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "navigationCommand", "Lcom/udacity/project4/utils/SingleLiveEvent;", "Lcom/udacity/project4/base/NavigationCommand;", "getNavigationCommand", "()Lcom/udacity/project4/utils/SingleLiveEvent;", "showErrorMessage", "", "getShowErrorMessage", "showLoading", "", "getShowLoading", "showNoData", "Landroidx/lifecycle/MutableLiveData;", "getShowNoData", "()Landroidx/lifecycle/MutableLiveData;", "showSnackBar", "getShowSnackBar", "showSnackBarInt", "", "getShowSnackBarInt", "showToast", "getShowToast", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.project4.utils.SingleLiveEvent<com.udacity.project4.base.NavigationCommand> navigationCommand = null;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.project4.utils.SingleLiveEvent<java.lang.String> showErrorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.project4.utils.SingleLiveEvent<java.lang.String> showSnackBar = null;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.project4.utils.SingleLiveEvent<java.lang.Integer> showSnackBarInt = null;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.project4.utils.SingleLiveEvent<java.lang.String> showToast = null;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.project4.utils.SingleLiveEvent<java.lang.Boolean> showLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showNoData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.project4.utils.SingleLiveEvent<com.udacity.project4.base.NavigationCommand> getNavigationCommand() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.project4.utils.SingleLiveEvent<java.lang.String> getShowErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.project4.utils.SingleLiveEvent<java.lang.String> getShowSnackBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.project4.utils.SingleLiveEvent<java.lang.Integer> getShowSnackBarInt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.project4.utils.SingleLiveEvent<java.lang.String> getShowToast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.project4.utils.SingleLiveEvent<java.lang.Boolean> getShowLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowNoData() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}