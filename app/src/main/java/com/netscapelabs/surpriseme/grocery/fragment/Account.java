package com.netscapelabs.surpriseme.grocery.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.netscapelabs.surpriseme.grocery.MainActivity;
import com.netscapelabs.surpriseme.grocery.Mainpagelogin;
import com.netscapelabs.surpriseme.grocery.R;
import com.netscapelabs.surpriseme.grocery.activity.Locationactivity;


public class Account extends Fragment {
TextView myaddress1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        myaddress1= view.findViewById(R.id.myaddress);
        myaddress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Locationactivity.class);
                startActivity(intent);

            }
        });
        return view;
    }
}