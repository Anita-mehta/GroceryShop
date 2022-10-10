package com.netscapelabs.surpriseme.grocery.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netscapelabs.surpriseme.grocery.MainActivity;
import com.netscapelabs.surpriseme.grocery.Mainpagelogin;
import com.netscapelabs.surpriseme.grocery.R;
import com.netscapelabs.surpriseme.grocery.activity.PersonalcareActivity;


public class Shopcard extends Fragment {

    ConstraintLayout cardviewg;
    public Shopcard() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_shopcard, container, false);
        cardviewg=view.findViewById(R.id.cardviewg1);
        cardviewg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), PersonalcareActivity.class);
                startActivity(intent);

            }
        });
        return view;
    }
}