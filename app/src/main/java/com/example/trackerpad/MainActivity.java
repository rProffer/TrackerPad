package com.example.trackerpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button newTaskButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newTaskButton = (Button) findViewById(R.id.newtaskbutton);
        newTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //open newTask fragment to add data to create an entry object
                Fragment fragment = new newTask();
                getSupportFragmentManager().beginTransaction()
                        .add(android.R.id.content, new newTask()).commit();
            }
        });

    }
}