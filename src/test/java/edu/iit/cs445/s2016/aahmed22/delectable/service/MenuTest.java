/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.service;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adeeb
 */
public class MenuTest {

    
    /*Categories*/
    private String [] nomeat = {"Vegan", "Vegetarian"};
    private String [] nodairy = {"Dairy Free", "Gluten free"};
    private String [] nogluten = {"Gluten free"};
    
    /*Foods*/
    private Food vegidog = new Food(0, "Vegi dog",nomeat, 200, 1, 2.25);
    private Food steak = new Food(1, "Steak",nodairy, 650, 1, 22.00);
    private Food bread = new Food(2, "Gluten free French Bread", nogluten, 250, 1, 1.25);
    
    /*Menu*/
    private Food [] menuItems = {vegidog,steak,bread};
    private Menu m;
    
    public MenuTest() {
        m = new Menu(0, menuItems);
    }
    
    /**
     * Test of getMenuid method, of class Menu.
     */
    @Test
    public void testGetMenuid() {
        System.out.println("getMenuid");
        int expResult = 0;
        int result = m.getMenuid();
        assertEquals(expResult, result);  
    }

    /**
     * Test of setMenuid method, of class Menu.
     */
    @Test
    public void testSetMenuid() {
        System.out.println("setMenuid");
        int menuid = 1;
        m.setMenuid(menuid); 
        assertEquals(menuid, m.getMenuid());
    }

    /**
     * Test of getAllFoods method, of class Menu.
     */
    @Test
    public void testGetAllFoods() {
        System.out.println("getAllFoods");
        Food[] expResult = menuItems;
        Food[] result = m.getMenuItems();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setAllFoods method, of class Menu.
     */
    @Test
    public void testSetAllFoods() {
        System.out.println("setAllFoods");
        Food cheesecake = new Food(0, "Vegi dog",nomeat, 200, 1, 5.00);
        Food[] allFoods = {vegidog,steak,bread,cheesecake};
        m.setMenuItems(allFoods);
        assertArrayEquals(allFoods, m.getMenuItems());
    }
    
}
