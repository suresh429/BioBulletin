package com.journals.biobulletin.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;


import com.journals.biobulletin.R;
import com.journals.biobulletin.databinding.CurrentIssueItem1Binding;
import com.journals.biobulletin.model.CurrentIssueResponse;

import java.util.List;

import static com.journals.biobulletin.helper.utils.viewInBrowser;


public class CurrentIssuesAdapter1 extends RecyclerView.Adapter<CurrentIssuesAdapter1.ViewHolder> {

    List<CurrentIssueResponse.CurrentissueDetailsBean> modelList;

    Context context;
    public CurrentIssuesAdapter1(List<CurrentIssueResponse.CurrentissueDetailsBean> modelList,Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CurrentIssuesAdapter1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(CurrentIssueItem1Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull CurrentIssuesAdapter1.ViewHolder holder, int position) {

        if (modelList.get(position).getArt_type() != null && !modelList.get(position).getArt_type().equalsIgnoreCase("null")
                && !modelList.get(position).getArt_type().isEmpty() ) {
            holder.rowItemBinding.txtIssueType.setText(modelList.get(position).getArt_type());
        } else {
            holder.rowItemBinding.txtIssueType.setVisibility(View.GONE);
        }

        if (modelList.get(position).getTitle() != null && !modelList.get(position).getTitle().equalsIgnoreCase("null")
                && !modelList.get(position).getTitle().isEmpty() ) {
            holder.rowItemBinding.txtIssueTitle.setText(modelList.get(position).getTitle());
        } else {
            holder.rowItemBinding.txtIssueTitle.setVisibility(View.GONE);
        }

        if (modelList.get(position).getAuthor_names() != null && !modelList.get(position).getAuthor_names().equalsIgnoreCase("null")
                && !modelList.get(position).getAuthor_names().isEmpty() ) {
            holder.rowItemBinding.txtIssueAuthor.setText(Html.fromHtml(modelList.get(position).getAuthor_names()));
        } else {
            holder.rowItemBinding.txtIssueAuthor.setVisibility(View.GONE);
        }

        if (modelList.get(position).getDoi_num() != null && !modelList.get(position).getDoi_num().equalsIgnoreCase("null")
                && !modelList.get(position).getDoi_num().isEmpty() ) {
            holder.rowItemBinding.txtIssueDOI.setText("DOI : " + modelList.get(position).getDoi_num());
        } else {
            holder.rowItemBinding.txtIssueDOI.setVisibility(View.GONE);
        }
        if (modelList.get(position).getAbstractlink() != null && !modelList.get(position).getAbstractlink().equalsIgnoreCase("null") && !modelList.get(position).getAbstractlink().isEmpty() ) {
            holder.rowItemBinding.txtAbstract.setVisibility(View.VISIBLE);
        } else {
            holder.rowItemBinding.txtAbstract.setVisibility(View.GONE);
        }

        if (modelList.get(position).getPdflink() != null && !modelList.get(position).getPdflink().equalsIgnoreCase("null") && !modelList.get(position).getPdflink().isEmpty() ) {
            holder.rowItemBinding.txtPDF.setVisibility(View.VISIBLE);
        } else {
            holder.rowItemBinding.txtPDF.setVisibility(View.GONE);
        }
        if (modelList.get(position).getFulltextlink() != null && !modelList.get(position).getFulltextlink().equalsIgnoreCase("null") && !modelList.get(position).getFulltextlink().isEmpty() ) {
            holder.rowItemBinding.txtFullText.setVisibility(View.VISIBLE);
        } else {
            holder.rowItemBinding.txtFullText.setVisibility(View.GONE);
        }

        holder.rowItemBinding.txtAbstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("abstractlink", modelList.get(position).getAbstractlink());
                bundle.putString("ActionBarTitle","Abstract");


                Navigation.findNavController(v).navigate(R.id.abstractDisplayFragment,bundle);
            }
        });
        holder.rowItemBinding.txtPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewInBrowser(context,modelList.get(position).getPdflink(),"Not Found");
            }
        });

        holder.rowItemBinding.txtFullText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewInBrowser(context,modelList.get(position).getFulltextlink(),"Not Found");
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CurrentIssueItem1Binding rowItemBinding;

        public ViewHolder(@NonNull CurrentIssueItem1Binding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }


}
