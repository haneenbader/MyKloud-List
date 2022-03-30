package com.example.mykloudlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.mykloudlist.Adapter.TaskAdapter;
import com.example.mykloudlist.Model.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        create some data
        ArrayList<Task> allTask =new ArrayList<Task>();
        allTask.add(new Task(1, "testTask1"));
        allTask.add(new Task(5, "testTask2"));
        allTask.add(new Task(3, "testTask3"));
        allTask.add(new Task(2, "testTask4"));
        allTask.add(new Task(7, "testTask5"));
        allTask.add(new Task(1, "testTask6"));


        RecyclerView allTaskRecyclerView = findViewById(R.id.allTaskRecyclerView);
//        set layout manager for this view
        allTaskRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        set adapter for recycler view
        allTaskRecyclerView.setAdapter(new TaskAdapter(allTask));



        FloatingActionButton addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        FloatingActionButton deleteButton = findViewById(R.id.deleteButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}