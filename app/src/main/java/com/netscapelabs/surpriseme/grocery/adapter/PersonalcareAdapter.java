package com.netscapelabs.surpriseme.grocery.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.netscapelabs.surpriseme.grocery.R;

public class PersonalcareAdapter extends RecyclerView.Adapter<PersonalcareAdapter.ViewHolder> {

    @Override
    public PersonalcareAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v = inflater.inflate(R.layout.personalcarelayout, parent, false);
        PersonalcareAdapter.ViewHolder viewHolder = new PersonalcareAdapter.ViewHolder(v);
        //  ImageView imageView = (ImageView) view.findViewById(R.id.fragment_a_imageView);

        // Button button = (Button) view.findViewById(R.id.fragment_a_btn);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonalcareAdapter.ViewHolder holder, int position) {
//        holder.btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DetailFragment = DetailFragment.newInstance();
//                getFragmentManager()
//                        .beginTransaction()
//                        .addSharedElement(, ViewCompat.getTransitionName(imageView))
//                        .addToBackStack(TAG)
//                        .replace(R.id.content, DetailFragment)
//                        .commit();
//            }
//        });
//    }

    }
    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView btn;
        public ViewHolder(View v) {
            super(v);


        }
    }




}
