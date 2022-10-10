package com.netscapelabs.surpriseme.grocery.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.netscapelabs.surpriseme.grocery.R;

public class CartAdapter  extends RecyclerView.Adapter<CartAdapter.ViewHolder> {

@Override
public CartAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
        parent.getContext());
        View v = inflater.inflate(R.layout.cartlayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
        }

@Override
public void onBindViewHolder(ViewHolder holder, final int position) {

        }

// Return the size of your dataset (invoked by the layout manager)
@Override
public int getItemCount() {
        return 4;
        }
public class ViewHolder extends RecyclerView.ViewHolder {

    public ViewHolder(View v) {
        super(v);

    }
}
}