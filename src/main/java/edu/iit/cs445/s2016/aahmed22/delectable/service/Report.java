/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.service;

/**
 *
 * @author adeeb
 */
public class Report {
    private Order [] orders;

    public Report(Order[] orders) {
        this.orders = orders;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Report{" + "orders=" + orders + '}';
    }
    
    public void createReport(){
        
    }
    
}
