/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.model;

import java.util.Objects;

/**
 *
 * @author adeeb
 */
public class Food {
    private int foodid;
    private String name; 
    private String [] category;
    private int calories;
    private int numOfPeople;
    private double price;

    public Food(int foodid, String name, String [] category, int calories, int numOfPeople, double price) {
        this.foodid = foodid;
        this.name = name;
        this.category = category;
        this.calories = calories;
        this.numOfPeople = numOfPeople;
        this.price = price;
    }

    public int getFoodid() {
        return foodid;
    }

    public void setFoodid(int foodid) {
        this.foodid = foodid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String [] getCategory() {
        return category;
    }

    public void setCategory(String [] category) {
        this.category = category;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" + "foodid=" + foodid + ", name=" + name + ", category=" + category + ", calories=" + calories + ", numOfPeople=" + numOfPeople + ", price=" + price + '}';
    }

  
}
