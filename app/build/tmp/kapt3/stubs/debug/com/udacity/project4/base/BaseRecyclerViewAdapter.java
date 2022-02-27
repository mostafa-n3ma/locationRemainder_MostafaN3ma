package com.udacity.project4.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B,\u0012%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0006\u0010\u0012\u001a\u00020\tJ\u0013\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\'J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001e\u0010\u001c\u001a\u00020\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/udacity/project4/base/BaseRecyclerViewAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/udacity/project4/base/DataBindingViewHolder;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "(Lkotlin/jvm/functions/Function1;)V", "_items", "", "items", "", "getItems", "()Ljava/util/List;", "addData", "clear", "getItem", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "getLayoutRes", "viewType", "getLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "app_debug"})
public abstract class BaseRecyclerViewAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.udacity.project4.base.DataBindingViewHolder<T>> {
    private java.util.List<T> _items;
    private final kotlin.jvm.functions.Function1<T, kotlin.Unit> callback = null;
    
    private final java.util.List<T> getItems() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.udacity.project4.base.DataBindingViewHolder<T> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.udacity.project4.base.DataBindingViewHolder<T> holder, int position) {
    }
    
    public final T getItem(int position) {
        return null;
    }
    
    /**
     * Adds data to the actual Dataset
     *
     * @param items to be merged
     */
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items) {
    }
    
    /**
     * Clears the _items data
     */
    public final void clear() {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutRes(int viewType);
    
    @org.jetbrains.annotations.Nullable()
    public androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
        return null;
    }
    
    public BaseRecyclerViewAdapter(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> callback) {
        super();
    }
    
    public BaseRecyclerViewAdapter() {
        super();
    }
}