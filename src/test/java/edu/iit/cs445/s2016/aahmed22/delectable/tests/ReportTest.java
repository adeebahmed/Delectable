/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.tests;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Report;
import java.util.ArrayList;
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
public class ReportTest {
    
    public ReportTest() {
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
     * Test of getReportId method, of class Report.
     */
    @Test
    public void testGetReportId() {
        System.out.println("getReportId");
        Report instance = null;
        int expResult = 0;
        int result = instance.getReportId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReportId method, of class Report.
     */
    @Test
    public void testSetReportId() {
        System.out.println("setReportId");
        int reportId = 0;
        Report instance = null;
        instance.setReportId(reportId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReportName method, of class Report.
     */
    @Test
    public void testGetReportName() {
        System.out.println("getReportName");
        Report instance = null;
        String expResult = "";
        String result = instance.getReportName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReportName method, of class Report.
     */
    @Test
    public void testSetReportName() {
        System.out.println("setReportName");
        String reportName = "";
        Report instance = null;
        instance.setReportName(reportName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrders method, of class Report.
     */
    @Test
    public void testGetOrders() {
        System.out.println("getOrders");
        Report instance = null;
        ArrayList[] expResult = null;
        ArrayList[] result = instance.getOrders();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrders method, of class Report.
     */
    @Test
    public void testSetOrders() {
        System.out.println("setOrders");
        ArrayList[] orders = null;
        Report instance = null;
        instance.setOrders(orders);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Report.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Report instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
