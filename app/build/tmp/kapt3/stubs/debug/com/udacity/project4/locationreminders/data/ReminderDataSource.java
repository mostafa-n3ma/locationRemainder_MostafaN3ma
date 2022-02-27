package com.udacity.project4.locationreminders.data;

import java.lang.System;

/**
 * Main entry point for accessing reminders data.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/udacity/project4/locationreminders/data/ReminderDataSource;", "", "deleteAllReminders", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminder", "Lcom/udacity/project4/locationreminders/data/dto/Result;", "Lcom/udacity/project4/locationreminders/data/dto/ReminderDTO;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminders", "", "saveReminder", "reminder", "(Lcom/udacity/project4/locationreminders/data/dto/ReminderDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ReminderDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReminders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.udacity.project4.locationreminders.data.dto.Result<? extends java.util.List<com.udacity.project4.locationreminders.data.dto.ReminderDTO>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveReminder(@org.jetbrains.annotations.NotNull()
    com.udacity.project4.locationreminders.data.dto.ReminderDTO reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReminder(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.udacity.project4.locationreminders.data.dto.Result<com.udacity.project4.locationreminders.data.dto.ReminderDTO>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllReminders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
}