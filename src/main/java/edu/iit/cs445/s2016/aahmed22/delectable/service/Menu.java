/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.service;

/**
 *
 * @author adeeb
 */
public class Menu {
    private int menuid;
    private Food [] allFoods;

    public Menu(int menuid, Food[] allFoods) {
        this.menuid = menuid;
        this.allFoods = allFoods;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public Food[] getAllFoods() {
        return allFoods;
    }

    public void setAllFoods(Food[] allFoods) {
        this.allFoods = allFoods;
    }

    @Override
    public String toString() {
        return "Menu{" + "menuid=" + menuid + ", allFoods=" + allFoods + '}';
    }
    
}
