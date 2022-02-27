package com.udacity.project4.base;

import java.lang.System;

/**
 * Base Fragment to observe on the common LiveData objects
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/udacity/project4/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_viewModel", "Lcom/udacity/project4/base/BaseViewModel;", "get_viewModel", "()Lcom/udacity/project4/base/BaseViewModel;", "onStart", "", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    private java.util.HashMap _$_findViewCache;
    
    /**
     * Every fragment has to have an instance of a view model that extends from the BaseViewModel
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.udacity.project4.base.BaseViewModel get_viewModel();
    
    @java.lang.Override()
    public void onStart() {
    }
    
    public BaseFragment() {
        super();
    }
}