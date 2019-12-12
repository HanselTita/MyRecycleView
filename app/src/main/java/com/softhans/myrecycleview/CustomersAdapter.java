package com.softhans.myrecycleview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.List;

public class CustomersAdapter extends RecyclerView.Adapter<CustomersAdapter.ViewHodler>{

    @NonNull
    @Override
    public CustomersAdapter.ViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        //inflate the custom layout
        View customerView = inflater.inflate(R.layout.rw_customers, parent,false);

        //Return a new holder instance
        return new ViewHodler (customerView);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomersAdapter.ViewHodler viewHolder, int position) {
            //Get the data model based on position
        Customers customers = mCustomers.get(position);

        //set item view based on your view and data model
        TextView textView = viewHolder.nameTextView;
        textView.setText(customers.getName());

        TextView textView2 = viewHolder.phoneTextView;
        textView2.setText(customers.isOnline() ? "Message" : "Offline");
    }

    @Override
    public int getItemCount() {
        return mCustomers.size();
    }



    //Store members variables for customers
    private List<Customers> mCustomers;

    //pass in the customers array into the constructor
    public CustomersAdapter(List<Customers> customers){
        mCustomers =customers;
    }


    public class ViewHodler extends ViewHolder {

        public TextView nameTextView, phoneTextView;


        public ViewHodler(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameId);
            phoneTextView = itemView.findViewById(R.id.phoneId);

        }
    }

}
