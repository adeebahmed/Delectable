/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Food;
import edu.iit.cs445.s2016.aahmed22.delectable.model.Menu;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
/**
 *
 * @author adeeb
 */
@Path("/admin")
public class AdminResource {
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/menu")
    public String setMenuItems(){
            /*Categories*/
        String [] nomeat = {"Vegan", "Vegetarian"};
        String [] nodairy = {"Dairy Free", "Gluten free"};
        String [] nogluten = {"Gluten free"};

        /*Foods*/
        Food vegidog = new Food(0, "Vegi dog",nomeat, 200, 1, 2.25);
        Food steak = new Food(1, "Steak",nodairy, 650, 1, 22.00);
        Food bread = new Food(2, "Gluten free French Bread", nogluten, 250, 1, 1.25);

        /*Menu*/
        Food [] menuItems = {vegidog,steak,bread};
        Menu m = new Menu(1, menuItems);
        
        return m.toString();
    }
}
