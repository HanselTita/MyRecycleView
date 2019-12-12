package com.softhans.myrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


/**
 * Open the build.gradle file and add the support library to the dependencies section
 * In this case -->implementation 'androidx.recyclerview:recyclerview:1.0.0'
 * Create the RecyclerView within your Layout
 * create your class for the source data. In this case: --> Customers.
 * create an xml layout for each row within the list. In this case -->rw_customers.
 * create an Adapter class. In this case: -->Customers.Adapter
 * Bind the adapter to your activity
 */
public class MainActivity extends AppCompatActivity {

    ArrayList<Customers> customers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Lookup the recyclerview in activity layout
        RecyclerView  rvCustomers = findViewById(R.id.rv_customers);

        //Initialize customers
        customers = Customers.createCustomerList(20);

        //Create adapter passing in the sample user data
        CustomersAdapter adapter = new CustomersAdapter(customers);

        //Attach the adapter to the recyclerview to populate items
        rvCustomers.setAdapter(adapter);

        //Set layout manager to position items
        rvCustomers.setLayoutManager(new LinearLayoutManager(this));
    }
}
