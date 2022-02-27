package com.udacity.project4.locationreminders;

import java.lang.System;

/**
 * Activity that displays the reminder details after the user clicks on the notification
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/udacity/project4/locationreminders/ReminderDescriptionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/udacity/project4/databinding/ActivityReminderDescriptionBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class ReminderDescriptionActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.udacity.project4.databinding.ActivityReminderDescriptionBinding binding;
    private static final java.lang.String EXTRA_ReminderDataItem = "EXTRA_ReminderDataItem";
    public static final com.udacity.project4.locationreminders.ReminderDescriptionActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public ReminderDescriptionActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/udacity/project4/locationreminders/ReminderDescriptionActivity$Companion;", "", "()V", "EXTRA_ReminderDataItem", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "reminderDataItem", "Lcom/udacity/project4/locationreminders/reminderslist/ReminderDataItem;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.udacity.project4.locationreminders.reminderslist.ReminderDataItem reminderDataItem) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}