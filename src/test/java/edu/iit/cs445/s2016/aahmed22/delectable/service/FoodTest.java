/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.service;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Food;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adeeb
 */
public class FoodTest {
    private Food f;
    private String [] catagories = {"vegitarian"};
            
    public FoodTest() {
         f = new Food(0, "Vegi dog",catagories, 200, 1, 2.25);
    }
   
    /**
     * Test of getFoodid method, of class Food.
     */
    @Test
    public void testGetFoodid() {
        System.out.println("getFoodid");
        int expResult = 0;
        int result = f.getFoodid();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFoodid method, of class Food.
     */
    @Test
    public void testSetFoodid() {
        System.out.println("setFoodid");
        int foodid = 1;
        f.setFoodid(foodid);
        assertEquals(foodid, f.getFoodid());   
    }

    /**
     * Test of getName method, of class Food.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Vegi dog";
        String result = f.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Food.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Vegitarian hot dog";
        f.setName(name); 
        assertEquals(name, f.getName());
    }

    /**
     * Test of getCategory method, of class Food.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        String[] expResult = {"vegitarian"};
        String[] result = f.getCategory();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setCategory method, of class Food.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String[] category = {"vegitarian", "vegan", "dairy free"};
        f.setCategory(category);
        assertArrayEquals(category, f.getCategory());
    }

    /**
     * Test of getCalories method, of class Food.
     */
    @Test
    public void testGetCalories() {
        System.out.println("getCalories");
        int expResult = 200;
        int result = f.getCalories();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCalories method, of class Food.
     */
    @Test
    public void testSetCalories() {
        System.out.println("setCalories");
        int calories = 220;
        f.setCalories(calories);
        assertEquals(calories, f.getCalories());
    }

    /**
     * Test of getNumOfPeople method, of class Food.
     */
    @Test
    public void testGetNumOfPeople() {
        System.out.println("getNumOfPeople");
        int expResult = 1;
        int result = f.getNumOfPeople();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumOfPeople method, of class Food.
     */
    @Test
    public void testSetNumOfPeople() {
        System.out.println("setNumOfPeople");
        int numOfPeople = 2;
        f.setNumOfPeople(numOfPeople);
        assertEquals(numOfPeople, f.getNumOfPeople());
    }

    /**
     * Test of getPrice method, of class Food.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 2.25;
        double result = f.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrice method, of class Food.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 2.50;
        f.setPrice(price);
        assertEquals(price, f.getPrice(), 0.0);
    }   
}
