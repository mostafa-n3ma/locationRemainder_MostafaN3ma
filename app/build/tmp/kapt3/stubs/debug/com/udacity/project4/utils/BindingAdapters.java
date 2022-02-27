package com.udacity.project4.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010\tJ,\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0018\u00010\u000fH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/udacity/project4/utils/BindingAdapters;", "", "()V", "setFadeVisible", "", "view", "Landroid/view/View;", "visible", "", "(Landroid/view/View;Ljava/lang/Boolean;)V", "setRecyclerViewData", "T", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "items", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public final class BindingAdapters {
    public static final com.udacity.project4.utils.BindingAdapters INSTANCE = null;
    
    /**
     * Use binding adapter to set the recycler view data using livedata object
     */
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @androidx.databinding.BindingAdapter(value = {"android:liveData"})
    public static final <T extends java.lang.Object>void setRecyclerViewData(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.util.List<T>> items) {
    }
    
    /**
     * Use this binding adapter to show and hide the views using boolean variables
     */
    @androidx.databinding.BindingAdapter(value = {"android:fadeVisible"})
    public static final void setFadeVisible(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean visible) {
    }
    
    private BindingAdapters() {
        super();
    }
}