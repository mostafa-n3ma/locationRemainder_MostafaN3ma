package com.udacity.project4.databinding;
import com.udacity.project4.R;
import com.udacity.project4.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRemindersBindingImpl extends FragmentRemindersBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.addReminderFAB, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRemindersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentRemindersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ProgressBar) bindings[3]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.noDataTextView.setTag(null);
        this.progressBar.setTag(null);
        this.refreshLayout.setTag(null);
        this.reminderssRecyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.udacity.project4.locationreminders.reminderslist.RemindersListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.udacity.project4.locationreminders.reminderslist.RemindersListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRemindersList((androidx.lifecycle.MutableLiveData<java.util.List<com.udacity.project4.locationreminders.reminderslist.ReminderDataItem>>) object, fieldId);
            case 1 :
                return onChangeViewModelShowLoading((com.udacity.project4.utils.SingleLiveEvent<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelShowNoData((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRemindersList(androidx.lifecycle.MutableLiveData<java.util.List<com.udacity.project4.locationreminders.reminderslist.ReminderDataItem>> ViewModelRemindersList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowLoading(com.udacity.project4.utils.SingleLiveEvent<java.lang.Boolean> ViewModelShowLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowNoData(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowNoData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.util.List<com.udacity.project4.locationreminders.reminderslist.ReminderDataItem>> viewModelRemindersList = null;
        java.lang.Boolean viewModelShowLoadingGetValue = null;
        boolean viewModelShowLoadingBooleanValue = false;
        java.util.List<com.udacity.project4.locationreminders.reminderslist.ReminderDataItem> viewModelRemindersListGetValue = null;
        com.udacity.project4.utils.SingleLiveEvent<java.lang.Boolean> viewModelShowLoading = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowNoData = null;
        com.udacity.project4.locationreminders.reminderslist.RemindersListViewModel viewModel = mViewModel;
        boolean viewModelShowNoDataBooleanValue = false;
        java.lang.Boolean viewModelShowNoDataGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.remindersList
                        viewModelRemindersList = viewModel.getRemindersList();
                    }
                    updateLiveDataRegistration(0, viewModelRemindersList);


                    if (viewModelRemindersList != null) {
                        // read viewModel.remindersList.getValue()
                        viewModelRemindersListGetValue = viewModelRemindersList.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showLoading
                        viewModelShowLoading = viewModel.getShowLoading();
                    }
                    updateLiveDataRegistration(1, viewModelShowLoading);


                    if (viewModelShowLoading != null) {
                        // read viewModel.showLoading.getValue()
                        viewModelShowLoadingGetValue = viewModelShowLoading.getValue();
                    }


                    if (viewModelShowLoadingGetValue != null) {
                        // read viewModel.showLoading.getValue().booleanValue()
                        viewModelShowLoadingBooleanValue = viewModelShowLoadingGetValue.booleanValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showNoData
                        viewModelShowNoData = viewModel.getShowNoData();
                    }
                    updateLiveDataRegistration(2, viewModelShowNoData);


                    if (viewModelShowNoData != null) {
                        // read viewModel.showNoData.getValue()
                        viewModelShowNoDataGetValue = viewModelShowNoData.getValue();
                    }


                    if (viewModelShowNoDataGetValue != null) {
                        // read viewModel.showNoData.getValue().booleanValue()
                        viewModelShowNoDataBooleanValue = viewModelShowNoDataGetValue.booleanValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            com.udacity.project4.utils.BindingAdapters.setFadeVisible(this.noDataTextView, viewModelShowNoDataBooleanValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.udacity.project4.utils.BindingAdapters.setFadeVisible(this.progressBar, viewModelShowLoadingBooleanValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.udacity.project4.utils.BindingAdapters.setRecyclerViewData(this.reminderssRecyclerView, viewModelRemindersList);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.remindersList
        flag 1 (0x2L): viewModel.showLoading
        flag 2 (0x3L): viewModel.showNoData
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}