/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.model;

/**
 *
 * @author adeeb
 */
public class Menu {
    private int menuid;
    private Food [] menuItems;

    public Menu(int menuid, Food[] allFoods) {
        this.menuid = menuid;
        this.menuItems = allFoods;
    }

    public Menu(int menuid) {
        this.menuid = menuid;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public Food[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(Food[] allFoods) {
        this.menuItems = allFoods;
    }

    @Override
    public String toString() {
        return "Menu{" + "menuid=" + menuid + ", allFoods=" + menuItems + '}';
    }
    
}
