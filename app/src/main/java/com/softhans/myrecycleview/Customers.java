package com.softhans.myrecycleview;

import java.util.ArrayList;

public class Customers {

    private String name;
    private boolean online;


    private static int lastCustomerId = 0;
    //constructor


    public Customers(String name, boolean online) {
        this.name = name;
        this.online = online;
    }

    public static ArrayList<Customers> createCustomerList(int numCustomer) {

        ArrayList<Customers> customers = new ArrayList<Customers>();
        for (int i = 1; i <numCustomer; i++)
        {

            customers.add(new Customers("Customer" + ++lastCustomerId, i <= numCustomer / 2));
        }
        return customers;
    }


    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
