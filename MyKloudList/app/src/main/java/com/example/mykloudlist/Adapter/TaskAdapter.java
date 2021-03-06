package com.example.mykloudlist.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mykloudlist.Model.Task;
import com.example.mykloudlist.R;

import java.util.ArrayList;
import java.util.List;

// 1- Create the class without extensions ..
// 6- Extend RecyclerView.Adapter - StudentAdapter.StudentViewHolder
public class TaskAdapter extends  RecyclerView.Adapter<TaskAdapter.TaskViewHolder>{

    // 2- create the list the the adapter will use to bind data
    List<Task> allTask = new ArrayList<>();
    // generate constructor
    public TaskAdapter(List<Task> allTask) {
        this.allTask = allTask;
    }


    // 3- create the ViewHolder class (Wraps the data and the view)
    public  static  class TaskViewHolder extends RecyclerView.ViewHolder {
        // 4- The model object
        public Task task ;
        // 5- view object
        View itemView ;
        // + setting the itemView value
        //generate constructor
        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }


    //    impliment after extend class
    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 7- create the view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_task_item,parent,false);
        TaskViewHolder taskViewHolder = new TaskViewHolder(view);
        return taskViewHolder;
    }
    //    impliment after extend class
//        bind data
    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        holder.task = allTask.get(position);


//        CheckBox checkBoxTask =holder.itemView.findViewById(R.id.checkBoxTaskFragment);
////      checkBoxTask.setText(holder.task.setName());
//        checkBoxTask.setText(holder.task.setPriority());



    }
    //    impliment after extend class to view all item
    @Override
    public int getItemCount() {
        return allTask.size();
    }


}