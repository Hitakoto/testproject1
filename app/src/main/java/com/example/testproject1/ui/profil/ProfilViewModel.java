package com.example.testproject1.ui.profil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfilViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProfilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Профиль");
    }

    public LiveData<String> getText() {
        return mText;
    }
}