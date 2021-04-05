package com.journals.biobulletin.ui.viewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.JsonObject;
import com.journals.biobulletin.model.CurrentIssueResponse;
import com.journals.biobulletin.network.JournalRepository;

public class CurrentIssueViewModel extends ViewModel {
    private MutableLiveData<String> toastMessageObserver ;
    private MutableLiveData<Boolean> progressbarObservable;
    private MutableLiveData<CurrentIssueResponse> mutableLiveData;

    public void init(String journalcode, String rel_keyword, Context context){
        if (mutableLiveData != null){
            return;
        }
        JournalRepository journalRepository = JournalRepository.getInstance(context);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("journalcode",journalcode);
        jsonObject.addProperty("rel_keyword",rel_keyword);
        mutableLiveData = journalRepository.getCurrentIssueData(jsonObject);
        progressbarObservable = journalRepository.getProgressbarObservable();
        toastMessageObserver = journalRepository.getToastObserver();
    }

    public LiveData<CurrentIssueResponse> getCurrentIssueRepository() {
        return mutableLiveData;
    }

    public LiveData<String> getToastObserver(){
        return toastMessageObserver;
    }

    public MutableLiveData<Boolean> getProgressbarObservable() {
        return progressbarObservable;
    }

}