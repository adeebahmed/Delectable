/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.service;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Customer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adeeb
 */
public class CustomerTest {
    private Customer c;
    public CustomerTest() {
          c = new Customer(0,"John", "doe","6303409897", "jdoe@gmail.com");
    }

    /**
     * Test of getCustomerid method, of class Customer.
     */
    @Test
    public void testGetCustomerid() {
        System.out.println("getCustomerid");
        int expResult = 0;
        int result = c.getCustomerid();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCustomerid method, of class Customer.
     */
    @Test
    public void testSetCustomerid() {
        System.out.println("setCustomerid");
        int customerid = 1;
        c.setCustomerid(1);
        assertEquals(customerid, c.getCustomerid());
    }

    /**
     * Test of getFirstname method, of class Customer.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        String expResult = "John";
        String result = c.getFirstname();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setFirstname method, of class Customer.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "Jane";
        c.setFirstname(firstname);
        assertEquals(firstname, c.getFirstname());
    }

    /**
     * Test of getLastname method, of class Customer.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname"); 
        String expResult = "doe";
        String result = c.getLastname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastname method, of class Customer.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "Does";
        c.setLastname(lastname);
        assertEquals(lastname, c.getLastname());
        
    }

    /**
     * Test of getPhonenumber method, of class Customer.
     */
    @Test
    public void testGetPhonenumber() {
        System.out.println("getPhonenumber");
        String expResult = "6303409897";
        String result = c.getPhonenumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhonenumber method, of class Customer.
     */
    @Test
    public void testSetPhonenumber() {
        System.out.println("setPhonenumber");
        String phonenumber = "911";
        c.setPhonenumber(phonenumber);
        assertEquals(phonenumber, c.getPhonenumber());
    }

    /**
     * Test of getEmail method, of class Customer.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        
        String expResult = "jdoe@gmail.com";
        String result = c.getEmail();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setEmail method, of class Customer.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "janedoe@gmail.com";
        
        c.setEmail(email);
        assertEquals(email, c.getEmail());
        
    }
    
}
