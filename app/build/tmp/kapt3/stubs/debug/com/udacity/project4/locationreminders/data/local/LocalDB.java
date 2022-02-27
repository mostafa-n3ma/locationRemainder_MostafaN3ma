package com.udacity.project4.locationreminders.data.local;

import java.lang.System;

/**
 * Singleton class that is used to create a reminder db
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/udacity/project4/locationreminders/data/local/LocalDB;", "", "()V", "createRemindersDao", "Lcom/udacity/project4/locationreminders/data/local/RemindersDao;", "context", "Landroid/content/Context;", "app_debug"})
public final class LocalDB {
    public static final com.udacity.project4.locationreminders.data.local.LocalDB INSTANCE = null;
    
    /**
     * static method that creates a reminder class and returns the DAO of the reminder
     */
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.project4.locationreminders.data.local.RemindersDao createRemindersDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private LocalDB() {
        super();
    }
}