/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.model;

import java.util.Date;

/**
 *
 * @author adeeb
 */
public class Order {
    private int orderid;
    private Food [] orderItems;
    private double total;
    private String shippingAddress;
    private String billingInfo;
    private String specialInstruction;
    private Date date;
    private Date deliveryDate;
    private String orderStatus;

    public Order(int orderid, Food[] orderItems, double total, String shippingAddress, String billingInfo, String specialInstruction, Date date, Date deliveryDate, String orderStatus) {
        this.orderid = orderid;
        this.orderItems = orderItems;
        this.total = total;
        this.shippingAddress = shippingAddress;
        this.billingInfo = billingInfo;
        this.specialInstruction = specialInstruction;
        this.date = date;
        this.deliveryDate = deliveryDate;
        this.orderStatus = orderStatus;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Food[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Food[] orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public String getSpecialInstruction() {
        return specialInstruction;
    }

    public void setSpecialInstruction(String specialInstruction) {
        this.specialInstruction = specialInstruction;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" + "orderid=" + orderid + ", orderItems=" + orderItems + ", total=" + total + ", shippingAddress=" + shippingAddress + ", billingInfo=" + billingInfo + ", specialInstruction=" + specialInstruction + ", date=" + date + ", deliveryDate=" + deliveryDate + ", orderStatus=" + orderStatus + '}';
    }
}