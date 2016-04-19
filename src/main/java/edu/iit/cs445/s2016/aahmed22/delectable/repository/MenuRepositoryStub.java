/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.repository;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Food;
import edu.iit.cs445.s2016.aahmed22.delectable.model.Menu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adeeb
 */
public class MenuRepositoryStub implements MenuRepository {
     /*Categories*/
    private String [] nomeat = {"Vegan", "Vegetarian"};
    private String [] nodairy = {"Dairy Free", "Gluten free"};
    private String [] nogluten = {"Gluten free"};
    
    /*Foods*/
    private Food vegidog = new Food(0, "Vegi dog",nomeat, 200, 1, 2.25);
    private Food steak = new Food(1, "Steak",nodairy, 650, 1, 22.00);
    private Food bread = new Food(2, "Gluten free French Bread", nogluten, 250, 1, 1.25);
    
    /*Order Items*/
    private Food [] menuItems = {vegidog,steak,bread};
    private Menu m;
    
    @Override
    public List<Menu> getMenus(){
        m = new Menu(1,menuItems);
        
        Food soup = new Food(0, "Hot soup",nodairy, 200, 1, 2.25);
        Food lobster = new Food(1, "Lobster",nodairy, 650, 1, 22.00);
        Food biscuts = new Food(2, "Biscuts", nomeat, 250, 1, 1.25);
        Food [] menuItems2 = {soup,lobster,biscuts};
        
        Menu m2 = new Menu(2,menuItems2);
        
        List<Menu> menus = new ArrayList<Menu>();
        menus.add(m);
        menus.add(m2);
        
        return menus;
    }
}
