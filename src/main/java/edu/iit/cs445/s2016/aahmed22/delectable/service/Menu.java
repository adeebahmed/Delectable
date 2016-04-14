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
    private String [] organicFoods;
    private String [] glutenfreeFoods;
    private String [] vegetarianFoods;
    private String [] veganFoods;
    private String [] dairyfreeFoods;

    public Menu(int menuid, String[] organicFoods, String[] glutenfreeFoods, String[] vegetarianFoods, String[] veganFoods, String[] dairyfreeFoods) {
        this.menuid = menuid;
        this.organicFoods = organicFoods;
        this.glutenfreeFoods = glutenfreeFoods;
        this.vegetarianFoods = vegetarianFoods;
        this.veganFoods = veganFoods;
        this.dairyfreeFoods = dairyfreeFoods;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String[] getOrganicFoods() {
        return organicFoods;
    }

    public void setOrganicFoods(String[] organicFoods) {
        this.organicFoods = organicFoods;
    }

    public String[] getGlutenfreeFoods() {
        return glutenfreeFoods;
    }

    public void setGlutenfreeFoods(String[] glutenfreeFoods) {
        this.glutenfreeFoods = glutenfreeFoods;
    }

    public String[] getVegetarianFoods() {
        return vegetarianFoods;
    }

    public void setVegetarianFoods(String[] vegetarianFoods) {
        this.vegetarianFoods = vegetarianFoods;
    }

    public String[] getVeganFoods() {
        return veganFoods;
    }

    public void setVeganFoods(String[] veganFoods) {
        this.veganFoods = veganFoods;
    }

    public String[] getDairyfreeFoods() {
        return dairyfreeFoods;
    }

    public void setDairyfreeFoods(String[] dairyfreeFoods) {
        this.dairyfreeFoods = dairyfreeFoods;
    }

    @Override
    public String toString() {
        return "Menu{" + "menuid=" + menuid + ", organicFoods=" + organicFoods + ", glutenfreeFoods=" + glutenfreeFoods + ", vegetarianFoods=" + vegetarianFoods + ", veganFoods=" + veganFoods + ", dairyfreeFoods=" + dairyfreeFoods + '}';
    }

    
}
