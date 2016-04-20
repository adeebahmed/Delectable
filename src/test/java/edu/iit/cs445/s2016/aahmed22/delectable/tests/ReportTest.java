/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.tests;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Food;
import edu.iit.cs445.s2016.aahmed22.delectable.model.Order;
import edu.iit.cs445.s2016.aahmed22.delectable.model.Report;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adeeb
 */
public class ReportTest {
    private Report r;
    
        
    /*Categories*/
    private String [] nomeat = {"Vegan", "Vegetarian"};
    private String [] nodairy = {"Dairy Free", "Gluten free"};
    private String [] nogluten = {"Gluten free"};
    
    /*Foods*/
    private Food vegidog = new Food(0, "Vegi dog",nomeat, 200, 1, 2.25);
    private Food steak = new Food(1, "Steak",nodairy, 650, 1, 22.00);
    private Food bread = new Food(2, "Gluten free French Bread", nogluten, 250, 1, 1.25);
    
    /*Order Items*/
    private Food [] orderItems = {vegidog,steak,bread};
    private Order o1,o2;
    
    public ReportTest(){
        double total = 0;
        for(int i = 0; i < orderItems.length; i++)
            total += orderItems[i].getPrice();
       
        o1 = new Order(0, orderItems,total, "3333 South Wabash Ave.","credit card info", "Call when outside.", new Date(), new Date(2016,4,20), "open");
        
        Food soup = new Food(0, "Hot soup",nodairy, 200, 1, 2.25);
        Food lobster = new Food(1, "Lobster",nodairy, 650, 1, 22.00);
        Food biscuts = new Food(2, "Biscuts", nomeat, 250, 1, 1.25);
        Food [] orderItems2 = {soup,lobster,biscuts};
        
        total = 0;
        for(int i = 0; i < orderItems2.length; i++)
            total += orderItems2[i].getPrice();
        
        o2 = new Order(0, orderItems2,total, "250 W. 31st St.","credit card info", "Call when outside.", new Date(), new Date(2016,4,20), "open");
        
        Order [] orders = {o1,o2};
        r = new Report(1,"TestReport",orders);
    }
    /**
     * Test of getReportId method, of class Report.
     */
    @Test
    public void testGetReportId() {
        System.out.println("getReportId");
        int expResult = 1;
        int result = r.getReportId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReportId method, of class Report.
     */
    @Test
    public void testSetReportId() {
        System.out.println("setReportId");
        int reportId = 2; 
        r.setReportId(reportId);
        assertEquals(reportId, r.getReportId());
    }

    /**
     * Test of getReportName method, of class Report.
     */
    @Test
    public void testGetReportName() {
        System.out.println("getReportName");
        String expResult = "TestReport";
        String result = r.getReportName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReportName method, of class Report.
     */
    @Test
    public void testSetReportName() {
        System.out.println("setReportName");
        String reportName = "ReportTest"; 
        r.setReportName(reportName);
        assertEquals(reportName, r.getReportName());
    }

    /**
     * Test of getOrders method, of class Report.
     */
    @Test
    public void testGetOrders() {
        System.out.println("getOrders");
        Order[] expResult = {o1,o2};
        Order[] result = r.getOrders();
        assertArrayEquals(expResult, result);  
    }

    /**
     * Test of setOrders method, of class Report.
     */
    @Test
    public void testSetOrders() {
        System.out.println("setOrders");
        Order[] orders = {o2,o1};
        r.setOrders(orders);
        assertArrayEquals(orders, r.getOrders());
    }
}
