package com.netscapelabs.surpriseme.grocery.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.netscapelabs.surpriseme.grocery.R;
import com.netscapelabs.surpriseme.grocery.adapter.CartAdapter;


public class Cardviewfragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    //private RecyclerView.LayoutManager layoutManager;
    private LinearLayoutManager layoutManager;

    public Cardviewfragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cardviewfragment, container, false);
        recyclerView =  view.findViewById(R.id.cardrecyclerview);
        layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new CartAdapter();
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
