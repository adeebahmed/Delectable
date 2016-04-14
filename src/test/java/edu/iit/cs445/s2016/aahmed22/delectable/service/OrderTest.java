/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.service;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adeeb
 */
public class OrderTest {
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getOrderid method, of class Order.
     */
    @Test
    public void testGetOrderid() {
        System.out.println("getOrderid");
        Order instance = null;
        int expResult = 0;
        int result = instance.getOrderid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderid method, of class Order.
     */
    @Test
    public void testSetOrderid() {
        System.out.println("setOrderid");
        int orderid = 0;
        Order instance = null;
        instance.setOrderid(orderid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderItems method, of class Order.
     */
    @Test
    public void testGetOrderItems() {
        System.out.println("getOrderItems");
        Order instance = null;
        Food[] expResult = null;
        Food[] result = instance.getOrderItems();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderItems method, of class Order.
     */
    @Test
    public void testSetOrderItems() {
        System.out.println("setOrderItems");
        Food[] orderItems = null;
        Order instance = null;
        instance.setOrderItems(orderItems);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Order.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Order instance = null;
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Order.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double total = 0.0;
        Order instance = null;
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShippingAddress method, of class Order.
     */
    @Test
    public void testGetShippingAddress() {
        System.out.println("getShippingAddress");
        Order instance = null;
        String expResult = "";
        String result = instance.getShippingAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShippingAddress method, of class Order.
     */
    @Test
    public void testSetShippingAddress() {
        System.out.println("setShippingAddress");
        String shippingAddress = "";
        Order instance = null;
        instance.setShippingAddress(shippingAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBillingInfo method, of class Order.
     */
    @Test
    public void testGetBillingInfo() {
        System.out.println("getBillingInfo");
        Order instance = null;
        String expResult = "";
        String result = instance.getBillingInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBillingInfo method, of class Order.
     */
    @Test
    public void testSetBillingInfo() {
        System.out.println("setBillingInfo");
        String billingInfo = "";
        Order instance = null;
        instance.setBillingInfo(billingInfo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialInstruction method, of class Order.
     */
    @Test
    public void testGetSpecialInstruction() {
        System.out.println("getSpecialInstruction");
        Order instance = null;
        String expResult = "";
        String result = instance.getSpecialInstruction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialInstruction method, of class Order.
     */
    @Test
    public void testSetSpecialInstruction() {
        System.out.println("setSpecialInstruction");
        String specialInstruction = "";
        Order instance = null;
        instance.setSpecialInstruction(specialInstruction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Order.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Order instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Order.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Order instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderStatus method, of class Order.
     */
    @Test
    public void testGetOrderStatus() {
        System.out.println("getOrderStatus");
        Order instance = null;
        String expResult = "";
        String result = instance.getOrderStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderStatus method, of class Order.
     */
    @Test
    public void testSetOrderStatus() {
        System.out.println("setOrderStatus");
        String orderStatus = "";
        Order instance = null;
        instance.setOrderStatus(orderStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Order.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Order instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
