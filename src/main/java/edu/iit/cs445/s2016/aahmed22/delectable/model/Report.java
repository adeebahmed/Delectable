/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.model;

import java.util.ArrayList;

/**
 *
 * @author adeeb
 */
public class Report {
    private ArrayList<Order> [] orders;

    public Report(ArrayList<Order>[] orders) {
        this.orders = orders;
    }

    public ArrayList<Order>[] getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order>[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Report{" + "orders=" + orders + '}';
    }
}
