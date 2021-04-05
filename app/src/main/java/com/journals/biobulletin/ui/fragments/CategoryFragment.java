package com.journals.biobulletin.ui.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.journals.biobulletin.databinding.FragmentCategoryBinding;
import com.journals.biobulletin.model.CategoryResponse;
import com.journals.biobulletin.model.HomeResponse;
import com.journals.biobulletin.ui.adapter.CategoryListAdapter;
import com.journals.biobulletin.ui.adapter.CurrentIssuesAdapter;
import com.journals.biobulletin.ui.viewmodel.CategoryViewModel;
import com.journals.biobulletin.ui.viewmodel.HomeViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoryFragment#} factory method to
 * create an instance of this fragment.
 */
public class CategoryFragment extends Fragment {
    private static final String TAG = "CategoryFragment";

    FragmentCategoryBinding fragmentCategoryBinding;
    ArrayList<CategoryResponse.JournalDetailsBean> subcatDetailsBeanArrayList = new ArrayList<>();
    ArrayList<HomeResponse.CurrissueHighlightsBean> currissueHighlightsBeanArrayList = new ArrayList<>();
    CategoryViewModel categoryViewModel;
    HomeViewModel homeViewModel;

    CategoryListAdapter categoryListAdapter;
    CurrentIssuesAdapter currentIssuesAdapter;


    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentCategoryBinding = FragmentCategoryBinding.inflate(getLayoutInflater(), container, false);


        categoryViewModel = new ViewModelProvider(this).get(CategoryViewModel.class);
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        categoryViewModel.init("1",requireActivity());
        homeViewModel.init("1",requireActivity());

        // progress bar
        categoryViewModel.getProgressbarObservable().observe(getViewLifecycleOwner(), aBoolean -> {
            if (aBoolean){
                fragmentCategoryBinding.progressBar.setVisibility(View.VISIBLE);
                fragmentCategoryBinding.txtJournalName.setVisibility(View.GONE);
                fragmentCategoryBinding.txtCurrentIssueName.setVisibility(View.GONE);
            }else {
                fragmentCategoryBinding.progressBar.setVisibility(View.GONE);
                fragmentCategoryBinding.txtJournalName.setVisibility(View.VISIBLE);
                fragmentCategoryBinding.txtCurrentIssueName.setVisibility(View.VISIBLE);
            }
        });

        // progress bar
        homeViewModel.getProgressbarObservable().observe(getViewLifecycleOwner(), aBoolean -> {
            if (aBoolean){
                fragmentCategoryBinding.progressBar.setVisibility(View.VISIBLE);
                fragmentCategoryBinding.txtJournalName.setVisibility(View.GONE);
                fragmentCategoryBinding.txtCurrentIssueName.setVisibility(View.GONE);
            }else {
                fragmentCategoryBinding.progressBar.setVisibility(View.GONE);
                fragmentCategoryBinding.txtJournalName.setVisibility(View.VISIBLE);
                fragmentCategoryBinding.txtCurrentIssueName.setVisibility(View.VISIBLE);
            }
        });



        // get home data
        categoryViewModel.getCategoryRepository().observe(getViewLifecycleOwner(), homeResponse -> {


            if (homeResponse != null){
                List<CategoryResponse.JournalDetailsBean> catDetailsBeanList = homeResponse.getJournal_details();

                subcatDetailsBeanArrayList.addAll(catDetailsBeanList);

                categoryListAdapter = new CategoryListAdapter(catDetailsBeanList, getActivity());
                fragmentCategoryBinding.recyclerCategoryList.setAdapter(categoryListAdapter);

                fragmentCategoryBinding.progressBar.setVisibility(View.GONE);

                categoryListAdapter.notifyDataSetChanged();
                fragmentCategoryBinding.txtEmptyView.setVisibility(View.GONE);
                Log.d(TAG, "onCreateView: "+" data found");
            }else {
                Log.d(TAG, "onCreateView: "+"NO data");
                fragmentCategoryBinding.recyclerCategoryList.setVisibility(View.GONE);
                fragmentCategoryBinding.txtEmptyView.setVisibility(View.VISIBLE);
            }

        });


        // get home data
        homeViewModel.getHomeRepository().observe(getViewLifecycleOwner(), homeResponse -> {


            if (homeResponse != null){
                List<HomeResponse.CurrissueHighlightsBean> catDetailsBeanList = homeResponse.getCurrissue_highlights();

                currissueHighlightsBeanArrayList.addAll(catDetailsBeanList);

                currentIssuesAdapter = new CurrentIssuesAdapter(catDetailsBeanList, getActivity());
                fragmentCategoryBinding.recyclerHomeCurrentIssue.setAdapter(currentIssuesAdapter);

                fragmentCategoryBinding.progressBar.setVisibility(View.GONE);

                currentIssuesAdapter.notifyDataSetChanged();
                fragmentCategoryBinding.txtEmptyView.setVisibility(View.GONE);
                Log.d(TAG, "onCreateView: "+" data found"+catDetailsBeanList.size());
            }else {
                Log.d(TAG, "onCreateView: "+"NO data");
                fragmentCategoryBinding.recyclerHomeCurrentIssue.setVisibility(View.GONE);
                fragmentCategoryBinding.txtEmptyView.setVisibility(View.VISIBLE);
            }

        });


        return fragmentCategoryBinding.getRoot();
    }

}