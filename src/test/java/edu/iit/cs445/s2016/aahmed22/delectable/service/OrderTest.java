/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.service;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Food;
import edu.iit.cs445.s2016.aahmed22.delectable.model.Order;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adeeb
 */
public class OrderTest {

        /*Categories*/
    private String [] nomeat = {"Vegan", "Vegetarian"};
    private String [] nodairy = {"Dairy Free", "Gluten free"};
    private String [] nogluten = {"Gluten free"};
    
    /*Foods*/
    private Food vegidog = new Food(0, "Vegi dog",nomeat, 200, 1, 2.25);
    private Food steak = new Food(1, "Steak",nodairy, 650, 1, 22.00);
    private Food bread = new Food(2, "Gluten free French Bread", nogluten, 250, 1, 1.25);
    
    /*Order*/
    private Food [] orderItems = {vegidog,steak,bread};
    private Order o;
        
    public OrderTest() {
        double total = 0;
        for(int i = 0; i < orderItems.length; i++)
            total += orderItems[i].getPrice();
        
        o = new Order(0, orderItems,total, "3333 South Wabash Ave.","credit card info", "Call when outside.", new Date(), "open");
    }

    /**
     * Test of getOrderid method, of class Order.
     */
    @Test
    public void testGetOrderid() {
        System.out.println("getOrderid");
        int expResult = 0;
        int result = o.getOrderid();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrderid method, of class Order.
     */
    @Test
    public void testSetOrderid() {
        System.out.println("setOrderid");
        int orderid = 1;
        o.setOrderid(orderid);
        assertEquals(orderid, o.getOrderid());
    }

    /**
     * Test of getOrderItems method, of class Order.
     */
    @Test
    public void testGetOrderItems() {
        System.out.println("getOrderItems");
        Food[] expResult = {vegidog,steak,bread};
        Food[] result = o.getOrderItems();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setOrderItems method, of class Order.
     */
    @Test
    public void testSetOrderItems() {
        System.out.println("setOrderItems");
        Food cheesecake = new Food(0, "Vegi dog",nomeat, 200, 1, 5.00);
        Food[] orderItems = {vegidog,steak,bread,cheesecake};
        o.setOrderItems(orderItems);
        assertArrayEquals(orderItems, o.getOrderItems());
    }

    /**
     * Test of getTotal method, of class Order.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        
        double total = 0;
        for(int i = 0; i < orderItems.length; i++)
            total += orderItems[i].getPrice();
        
        double result = o.getTotal();
        assertEquals(total, result, 0.0);
    }

    /**
     * Test of setTotal method, of class Order.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double total = 100.56;
        o.setTotal(total);
        assertEquals(total, o.getTotal(), 0.0);
    }

    /**
     * Test of getShippingAddress method, of class Order.
     */
    @Test
    public void testGetShippingAddress() {
        System.out.println("getShippingAddress");
        String expResult = "3333 South Wabash Ave.";
        String result = o.getShippingAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setShippingAddress method, of class Order.
     */
    @Test
    public void testSetShippingAddress() {
        System.out.println("setShippingAddress");
        String shippingAddress = "250 West 31st St.";
        o.setShippingAddress(shippingAddress);
    }

    /**
     * Test of getBillingInfo method, of class Order.
     */
    @Test
    public void testGetBillingInfo() {
        System.out.println("getBillingInfo");
        String expResult = "credit card info";
        String result = o.getBillingInfo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBillingInfo method, of class Order.
     */
    @Test
    public void testSetBillingInfo() {
        System.out.println("setBillingInfo");
        String billingInfo = "1111222233334444";
        o.setBillingInfo(billingInfo);
        assertEquals(billingInfo, o.getBillingInfo());
    }

    /**
     * Test of getSpecialInstruction method, of class Order.
     */
    @Test
    public void testGetSpecialInstruction() {
        System.out.println("getSpecialInstruction");
        String expResult = "Call when outside.";
        String result = o.getSpecialInstruction();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSpecialInstruction method, of class Order.
     */
    @Test
    public void testSetSpecialInstruction() {
        System.out.println("setSpecialInstruction");
        String specialInstruction = "No pork!";
        o.setSpecialInstruction(specialInstruction);
        assertEquals(specialInstruction, o.getSpecialInstruction());
    }

    /**
     * Test of getDate method, of class Order.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Date expResult = new Date();
        Date result = o.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Order.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = new Date(1995,8,26);
        o.setDate(date);
        assertEquals(date, o.getDate());
    }

    /**
     * Test of getOrderStatus method, of class Order.
     */
    @Test
    public void testGetOrderStatus() {
        System.out.println("getOrderStatus");
        String expResult = "open";
        String result = o.getOrderStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrderStatus method, of class Order.
     */
    @Test
    public void testSetOrderStatus() {
        System.out.println("setOrderStatus");
        String orderStatus = "canceled";
        o.setOrderStatus(orderStatus);
        assertEquals(orderStatus, o.getOrderStatus());
    }  
}
