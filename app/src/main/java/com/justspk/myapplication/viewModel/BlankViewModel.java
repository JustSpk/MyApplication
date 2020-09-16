package com.justspk.myapplication.viewModel;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.lifecycle.ViewModel;

import com.justspk.myapplication.model.Task;

public class BlankViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private Task task;

    public BlankViewModel() {
        task = new Task("","");
    }

    private String successMessage = "Login was successful";

    private String errorMessage = "Email or Password not valid";

//    @Bindable
    private String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }


    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
//        notifyPropertyChanged(BR.toastMessage);
    }


    public void setUserEmail(String email) {
        task.setEmail(email);
//        notifyPropertyChanged(BR.userEmail);
    }

//    @Bindable
    public String getUserEmail() {
        return task.getEmail();
    }

//    @Bindable
    public String getUserPassword() {
        return task.getPassword();
    }

    public void setUserPassword(String password) {
        task.setPassword(password);
//        notifyPropertyChanged(BR.userPassword);
    }

    public void onLoginClicked() {
        if (isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getUserEmail()) && Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() && getUserPassword().length() > 5;
    }
}