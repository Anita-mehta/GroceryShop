package com.netscapelabs.surpriseme.grocery.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.netscapelabs.surpriseme.grocery.R;
import com.netscapelabs.surpriseme.grocery.adapter.AllAdapter;
import com.netscapelabs.surpriseme.grocery.adapter.PersonalcareAdapter;

public class PersonalcareActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    //private RecyclerView.LayoutManager layoutManager;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalcare);
        recyclerView =  findViewById(R.id.personalproduct);
        // layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        layoutManager = new GridLayoutManager(PersonalcareActivity.this,1);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new PersonalcareAdapter();
        recyclerView.setAdapter(mAdapter);
    }
}