package com.udacity.project4.base;

import java.lang.System;

/**
 * Sealed class used with the live data to navigate between the fragments
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/udacity/project4/base/NavigationCommand;", "", "()V", "Back", "BackTo", "To", "Lcom/udacity/project4/base/NavigationCommand$To;", "Lcom/udacity/project4/base/NavigationCommand$Back;", "Lcom/udacity/project4/base/NavigationCommand$BackTo;", "app_debug"})
public abstract class NavigationCommand {
    
    private NavigationCommand() {
        super();
    }
    
    /**
     * navigate to a direction
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/udacity/project4/base/NavigationCommand$To;", "Lcom/udacity/project4/base/NavigationCommand;", "directions", "Landroidx/navigation/NavDirections;", "(Landroidx/navigation/NavDirections;)V", "getDirections", "()Landroidx/navigation/NavDirections;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class To extends com.udacity.project4.base.NavigationCommand {
        @org.jetbrains.annotations.NotNull()
        private final androidx.navigation.NavDirections directions = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections getDirections() {
            return null;
        }
        
        public To(@org.jetbrains.annotations.NotNull()
        androidx.navigation.NavDirections directions) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections component1() {
            return null;
        }
        
        /**
         * navigate to a direction
         */
        @org.jetbrains.annotations.NotNull()
        public final com.udacity.project4.base.NavigationCommand.To copy(@org.jetbrains.annotations.NotNull()
        androidx.navigation.NavDirections directions) {
            return null;
        }
        
        /**
         * navigate to a direction
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * navigate to a direction
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * navigate to a direction
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    /**
     * navigate back to the previous fragment
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/udacity/project4/base/NavigationCommand$Back;", "Lcom/udacity/project4/base/NavigationCommand;", "()V", "app_debug"})
    public static final class Back extends com.udacity.project4.base.NavigationCommand {
        public static final com.udacity.project4.base.NavigationCommand.Back INSTANCE = null;
        
        private Back() {
            super();
        }
    }
    
    /**
     * navigate back to a destination in the back stack
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/udacity/project4/base/NavigationCommand$BackTo;", "Lcom/udacity/project4/base/NavigationCommand;", "destinationId", "", "(I)V", "getDestinationId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class BackTo extends com.udacity.project4.base.NavigationCommand {
        private final int destinationId = 0;
        
        public final int getDestinationId() {
            return 0;
        }
        
        public BackTo(int destinationId) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        /**
         * navigate back to a destination in the back stack
         */
        @org.jetbrains.annotations.NotNull()
        public final com.udacity.project4.base.NavigationCommand.BackTo copy(int destinationId) {
            return null;
        }
        
        /**
         * navigate back to a destination in the back stack
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * navigate back to a destination in the back stack
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * navigate back to a destination in the back stack
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}