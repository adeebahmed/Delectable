/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Menu;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 *
 * @author adeeb
 */

@Path("/menu")
public class MenuResource {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String createMenu(){
        Menu m = new Menu(1);
        return m.toString();
    }
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{mid}")
    public String getTest(){
        return "hello!";
    }
    
}
