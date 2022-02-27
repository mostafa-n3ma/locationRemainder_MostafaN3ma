package com.udacity.project4.locationreminders.data.local;

import java.lang.System;

/**
 * Data Access Object for the reminders table.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/udacity/project4/locationreminders/data/local/RemindersDao;", "", "deleteAllReminders", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminderById", "Lcom/udacity/project4/locationreminders/data/dto/ReminderDTO;", "reminderId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminders", "", "saveReminder", "reminder", "(Lcom/udacity/project4/locationreminders/data/dto/ReminderDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RemindersDao {
    
    /**
     * @return all reminders.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM reminders")
    public abstract java.lang.Object getReminders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.udacity.project4.locationreminders.data.dto.ReminderDTO>> p0);
    
    /**
     * @param reminderId the id of the reminder
     * @return the reminder object with the reminderId
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM reminders where entry_id = :reminderId")
    public abstract java.lang.Object getReminderById(@org.jetbrains.annotations.NotNull()
    java.lang.String reminderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.udacity.project4.locationreminders.data.dto.ReminderDTO> p1);
    
    /**
     * Insert a reminder in the database. If the reminder already exists, replace it.
     *
     * @param reminder the reminder to be inserted.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveReminder(@org.jetbrains.annotations.NotNull()
    com.udacity.project4.locationreminders.data.dto.ReminderDTO reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    /**
     * Delete all reminders.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM reminders")
    public abstract java.lang.Object deleteAllReminders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
}