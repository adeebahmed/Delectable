/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.repository;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Food;
import edu.iit.cs445.s2016.aahmed22.delectable.model.Order;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author adeeb
 */
public class OrderRepositoryStub implements OrderRepository {
    private String [] nomeat = {"Vegan", "Vegetarian"};
    private String [] nodairy = {"Dairy Free", "Gluten free"};
    private String [] nogluten = {"Gluten free"};
    
    /*Foods*/
    private Food vegidog = new Food(0, "Vegi dog",nomeat, 200, 1, 2.25);
    private Food steak = new Food(1, "Steak",nodairy, 650, 1, 22.00);
    private Food bread = new Food(2, "Gluten free French Bread", nogluten, 250, 1, 1.25);
    
    /*Order*/
    private Food [] orderItems = {vegidog,steak,bread};

    @Override
    public List<Order> getOrders(){
        List<Order> orders = new ArrayList<Order>();
        double total = 0;
        
        for(int i = 0; i < orderItems.length; i++)
            total += orderItems[i].getPrice();
        
        Order o1 = new Order(1, orderItems,total, "3333 South Wabash Ave.","credit card info", "Call when outside.", new Date(),new Date(2016,4,20), "open");
        
        Food soup = new Food(0, "Hot soup",nodairy, 200, 1, 5.25);
        Food lobster = new Food(1, "Lobster",nodairy, 650, 1, 25.00);
        Food biscuts = new Food(2, "Biscuts", nomeat, 250, 1, 2.25);
        Food [] orderItems2 = {soup,lobster,biscuts};
        
        total = 0;
        for(int i = 0; i < orderItems2.length; i++)
            total += orderItems2[i].getPrice();
        
        Order o2 = new Order(2, orderItems2,total, "3333 South Wabash Ave.","credit card info", "Call when outside.", new Date(),new Date(2016,4,20), "open");
        
        orders.add(o1);
        orders.add(o2);
        
        return orders;
    }
}
