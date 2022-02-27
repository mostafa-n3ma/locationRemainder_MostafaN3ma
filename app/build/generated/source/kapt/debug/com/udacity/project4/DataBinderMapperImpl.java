package com.udacity.project4;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.udacity.project4.databinding.ActivityAuthenticationBindingImpl;
import com.udacity.project4.databinding.ActivityReminderDescriptionBindingImpl;
import com.udacity.project4.databinding.FragmentRemindersBindingImpl;
import com.udacity.project4.databinding.FragmentSaveReminderBindingImpl;
import com.udacity.project4.databinding.FragmentSelectLocationBindingImpl;
import com.udacity.project4.databinding.ItReminderBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAUTHENTICATION = 1;

  private static final int LAYOUT_ACTIVITYREMINDERDESCRIPTION = 2;

  private static final int LAYOUT_FRAGMENTREMINDERS = 3;

  private static final int LAYOUT_FRAGMENTSAVEREMINDER = 4;

  private static final int LAYOUT_FRAGMENTSELECTLOCATION = 5;

  private static final int LAYOUT_ITREMINDER = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.project4.R.layout.activity_authentication, LAYOUT_ACTIVITYAUTHENTICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.project4.R.layout.activity_reminder_description, LAYOUT_ACTIVITYREMINDERDESCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.project4.R.layout.fragment_reminders, LAYOUT_FRAGMENTREMINDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.project4.R.layout.fragment_save_reminder, LAYOUT_FRAGMENTSAVEREMINDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.project4.R.layout.fragment_select_location, LAYOUT_FRAGMENTSELECTLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.udacity.project4.R.layout.it_reminder, LAYOUT_ITREMINDER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAUTHENTICATION: {
          if ("layout/activity_authentication_0".equals(tag)) {
            return new ActivityAuthenticationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_authentication is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREMINDERDESCRIPTION: {
          if ("layout/activity_reminder_description_0".equals(tag)) {
            return new ActivityReminderDescriptionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_reminder_description is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREMINDERS: {
          if ("layout/fragment_reminders_0".equals(tag)) {
            return new FragmentRemindersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_reminders is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSAVEREMINDER: {
          if ("layout/fragment_save_reminder_0".equals(tag)) {
            return new FragmentSaveReminderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_save_reminder is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSELECTLOCATION: {
          if ("layout/fragment_select_location_0".equals(tag)) {
            return new FragmentSelectLocationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_select_location is invalid. Received: " + tag);
        }
        case  LAYOUT_ITREMINDER: {
          if ("layout/it_reminder_0".equals(tag)) {
            return new ItReminderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for it_reminder is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "item");
      sKeys.put(2, "reminderDataItem");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_authentication_0", com.udacity.project4.R.layout.activity_authentication);
      sKeys.put("layout/activity_reminder_description_0", com.udacity.project4.R.layout.activity_reminder_description);
      sKeys.put("layout/fragment_reminders_0", com.udacity.project4.R.layout.fragment_reminders);
      sKeys.put("layout/fragment_save_reminder_0", com.udacity.project4.R.layout.fragment_save_reminder);
      sKeys.put("layout/fragment_select_location_0", com.udacity.project4.R.layout.fragment_select_location);
      sKeys.put("layout/it_reminder_0", com.udacity.project4.R.layout.it_reminder);
    }
  }
}
