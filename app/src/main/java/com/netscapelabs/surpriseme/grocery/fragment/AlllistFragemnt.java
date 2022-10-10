package com.netscapelabs.surpriseme.grocery.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netscapelabs.surpriseme.grocery.R;
import com.netscapelabs.surpriseme.grocery.adapter.AllAdapter;
import com.netscapelabs.surpriseme.grocery.adapter.CartAdapter;


public class AlllistFragemnt extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    //private RecyclerView.LayoutManager layoutManager;
    private LinearLayoutManager layoutManager;


    public AlllistFragemnt() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_alllist_fragemnt, container, false);
        recyclerView =  view.findViewById(R.id.allproduct);
       // layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AllAdapter();
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}