/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.model;


import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adeeb
 */
@XmlRootElement
public class Customer {
    private int customerid;
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String email;
    private Order [] orders;

    public Customer(){
        
    }
    
    public Customer(int customerid, String firstname, String lastname, String phonenumber, String email, Order [] orders) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.orders = orders;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Order [] getOrders() {
        return orders;
    }

    public void setOrders(Order [] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname + ", phonenumber=" + phonenumber + ", email=" + email + ", orders=" + orders + '}';
    }
    
}
