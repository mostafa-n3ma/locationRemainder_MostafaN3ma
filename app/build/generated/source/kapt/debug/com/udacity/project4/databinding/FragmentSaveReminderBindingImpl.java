package com.udacity.project4.databinding;
import com.udacity.project4.R;
import com.udacity.project4.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSaveReminderBindingImpl extends FragmentSaveReminderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.selectLocation, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener reminderDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.reminderDescription.getValue()
            //         is viewModel.reminderDescription.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(reminderDescription);
            // localize variables for thread safety
            // viewModel.reminderDescription
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelReminderDescription = null;
            // viewModel.reminderDescription != null
            boolean viewModelReminderDescriptionJavaLangObjectNull = false;
            // viewModel
            com.udacity.project4.locationreminders.savereminder.SaveReminderViewModel viewModel = mViewModel;
            // viewModel.reminderDescription.getValue()
            java.lang.String viewModelReminderDescriptionGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelReminderDescription = viewModel.getReminderDescription();

                viewModelReminderDescriptionJavaLangObjectNull = (viewModelReminderDescription) != (null);
                if (viewModelReminderDescriptionJavaLangObjectNull) {




                    viewModelReminderDescription.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener reminderTitleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.reminderTitle.getValue()
            //         is viewModel.reminderTitle.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(reminderTitle);
            // localize variables for thread safety
            // viewModel.reminderTitle.getValue()
            java.lang.String viewModelReminderTitleGetValue = null;
            // viewModel
            com.udacity.project4.locationreminders.savereminder.SaveReminderViewModel viewModel = mViewModel;
            // viewModel.reminderTitle
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelReminderTitle = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.reminderTitle != null
            boolean viewModelReminderTitleJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelReminderTitle = viewModel.getReminderTitle();

                viewModelReminderTitleJavaLangObjectNull = (viewModelReminderTitle) != (null);
                if (viewModelReminderTitleJavaLangObjectNull) {




                    viewModelReminderTitle.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSaveReminderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentSaveReminderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ProgressBar) bindings[5]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.reminderDescription.setTag(null);
        this.reminderTitle.setTag(null);
        this.saveReminder.setTag(null);
        this.selectedLocation.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewModel((com.udacity.project4.locationreminders.savereminder.SaveReminderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.udacity.project4.locationreminders.savereminder.SaveReminderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelReminderDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelShowLoading((com.udacity.project4.utils.SingleLiveEvent<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelReminderTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelReminderSelectedLocationStr((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelReminderDescription(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelReminderDescription, int fieldId) {
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
    private boolean onChangeViewModelReminderTitle(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelReminderTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelReminderSelectedLocationStr(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelReminderSelectedLocationStr, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.Boolean viewModelShowLoadingGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelReminderDescription = null;
        boolean viewModelShowLoadingBooleanValue = false;
        java.lang.String viewModelReminderSelectedLocationStrGetValue = null;
        boolean ViewModelShowLoadingBooleanValue1 = false;
        java.lang.String viewModelReminderDescriptionGetValue = null;
        com.udacity.project4.utils.SingleLiveEvent<java.lang.Boolean> viewModelShowLoading = null;
        java.lang.String viewModelReminderTitleGetValue = null;
        com.udacity.project4.locationreminders.savereminder.SaveReminderViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelReminderTitle = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelReminderSelectedLocationStr = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.reminderDescription
                        viewModelReminderDescription = viewModel.getReminderDescription();
                    }
                    updateLiveDataRegistration(0, viewModelReminderDescription);


                    if (viewModelReminderDescription != null) {
                        // read viewModel.reminderDescription.getValue()
                        viewModelReminderDescriptionGetValue = viewModelReminderDescription.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

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
                        ViewModelShowLoadingBooleanValue1 = viewModelShowLoadingGetValue.booleanValue();
                    }


                    // read !viewModel.showLoading.getValue().booleanValue()
                    viewModelShowLoadingBooleanValue = !ViewModelShowLoadingBooleanValue1;
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.reminderTitle
                        viewModelReminderTitle = viewModel.getReminderTitle();
                    }
                    updateLiveDataRegistration(2, viewModelReminderTitle);


                    if (viewModelReminderTitle != null) {
                        // read viewModel.reminderTitle.getValue()
                        viewModelReminderTitleGetValue = viewModelReminderTitle.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.reminderSelectedLocationStr
                        viewModelReminderSelectedLocationStr = viewModel.getReminderSelectedLocationStr();
                    }
                    updateLiveDataRegistration(3, viewModelReminderSelectedLocationStr);


                    if (viewModelReminderSelectedLocationStr != null) {
                        // read viewModel.reminderSelectedLocationStr.getValue()
                        viewModelReminderSelectedLocationStrGetValue = viewModelReminderSelectedLocationStr.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            com.udacity.project4.utils.BindingAdapters.setFadeVisible(this.progressBar, ViewModelShowLoadingBooleanValue1);
            com.udacity.project4.utils.BindingAdapters.setFadeVisible(this.saveReminder, viewModelShowLoadingBooleanValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.reminderDescription, viewModelReminderDescriptionGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.reminderDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, reminderDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.reminderTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, reminderTitleandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.reminderTitle, viewModelReminderTitleGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.selectedLocation, viewModelReminderSelectedLocationStrGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.reminderDescription
        flag 1 (0x2L): viewModel.showLoading
        flag 2 (0x3L): viewModel.reminderTitle
        flag 3 (0x4L): viewModel.reminderSelectedLocationStr
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}