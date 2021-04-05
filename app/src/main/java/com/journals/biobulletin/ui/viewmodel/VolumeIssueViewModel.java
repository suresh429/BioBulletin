package com.journals.biobulletin.ui.viewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.JsonObject;
import com.journals.biobulletin.model.VolumeIssueResponse;
import com.journals.biobulletin.network.JournalRepository;

public class VolumeIssueViewModel extends ViewModel {
    private MutableLiveData<String> toastMessageObserver ;
    private MutableLiveData<Boolean> progressbarObservable;
    private MutableLiveData<VolumeIssueResponse> mutableLiveData;

    public void init(String journalcode, String volume, String issue, String year, Context context){
        if (mutableLiveData != null){
            return;
        }


        JournalRepository journalRepository = JournalRepository.getInstance(context);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("journalcode",journalcode);
        jsonObject.addProperty("volume",volume);
        jsonObject.addProperty("issue",issue);
        jsonObject.addProperty("year",year);
        mutableLiveData = journalRepository.getVolumeIssueData(jsonObject);
        progressbarObservable = journalRepository.getProgressbarObservable();
        toastMessageObserver = journalRepository.getToastObserver();
    }

    public LiveData<VolumeIssueResponse> getVolumeIssueRepository() {
        return mutableLiveData;
    }

    public LiveData<String> getToastObserver(){
        return toastMessageObserver;
    }

    public MutableLiveData<Boolean> getProgressbarObservable() {
        return progressbarObservable;
    }

}