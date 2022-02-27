package com.udacity.project4.locationreminders.data.local;

import java.lang.System;

/**
 * Concrete implementation of a data source as a db.
 *
 * The repository is implemented so that you can focus on only testing it.
 *
 * @param remindersDao the dao that does the Room db operations
 * @param ioDispatcher a coroutine dispatcher to offload the blocking IO tasks
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/udacity/project4/locationreminders/data/local/RemindersLocalRepository;", "Lcom/udacity/project4/locationreminders/data/ReminderDataSource;", "remindersDao", "Lcom/udacity/project4/locationreminders/data/local/RemindersDao;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/udacity/project4/locationreminders/data/local/RemindersDao;Lkotlinx/coroutines/CoroutineDispatcher;)V", "deleteAllReminders", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminder", "Lcom/udacity/project4/locationreminders/data/dto/Result;", "Lcom/udacity/project4/locationreminders/data/dto/ReminderDTO;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminders", "", "saveReminder", "reminder", "(Lcom/udacity/project4/locationreminders/data/dto/ReminderDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemindersLocalRepository implements com.udacity.project4.locationreminders.data.ReminderDataSource {
    private final com.udacity.project4.locationreminders.data.local.RemindersDao remindersDao = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    /**
     * Get the reminders list from the local db
     * @return Result the holds a Success with all the reminders or an Error object with the error message
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getReminders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.udacity.project4.locationreminders.data.dto.Result<? extends java.util.List<com.udacity.project4.locationreminders.data.dto.ReminderDTO>>> p0) {
        return null;
    }
    
    /**
     * Insert a reminder in the db.
     * @param reminder the reminder to be inserted
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveReminder(@org.jetbrains.annotations.NotNull()
    com.udacity.project4.locationreminders.data.dto.ReminderDTO reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * Get a reminder by its id
     * @param id to be used to get the reminder
     * @return Result the holds a Success object with the Reminder or an Error object with the error message
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getReminder(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.udacity.project4.locationreminders.data.dto.Result<com.udacity.project4.locationreminders.data.dto.ReminderDTO>> p1) {
        return null;
    }
    
    /**
     * Deletes all the reminders in the db
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAllReminders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public RemindersLocalRepository(@org.jetbrains.annotations.NotNull()
    com.udacity.project4.locationreminders.data.local.RemindersDao remindersDao, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
}