package com.example.hp.qalightandroidapp.fragments.materialsandtests.hometask.recyclerviewhometask;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.qalightandroidapp.R;

import java.util.List;

/**
 * Created by hp on 014 14.09.2017.
 */

public class ModelHomeTaskAdapter extends RecyclerView.Adapter<ModelHomeTaskViewHolder> {
    private List<ModelHomeTask> modelHomeTaskList;


    @Override
    public ModelHomeTaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_task_fragment_card_view, parent, false);


        return new ModelHomeTaskViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ModelHomeTaskViewHolder holder, int position) {
        ModelHomeTask modelHomeTask = modelHomeTaskList.get(position);

        holder.textViewTitle.setText(modelHomeTask.getTitle());
        holder.textViewDescription.setText(modelHomeTask.getDescription());
    }


    @Override
    public int getItemCount() {
        return modelHomeTaskList.size();
    }

    public ModelHomeTaskAdapter(List<ModelHomeTask> modelHomeTaskList) {
        this.modelHomeTaskList = modelHomeTaskList;
    }
}