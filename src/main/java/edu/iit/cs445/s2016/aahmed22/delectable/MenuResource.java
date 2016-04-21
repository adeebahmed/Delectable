/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Menu;
import edu.iit.cs445.s2016.aahmed22.delectable.repository.MenuRepository;
import edu.iit.cs445.s2016.aahmed22.delectable.repository.MenuRepositoryStub;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 *
 * @author adeeb
 */

@Path("/menu")
public class MenuResource {
    
    private MenuRepository mr = new MenuRepositoryStub();
    private List<Menu> menus = mr.getMenus();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMenuItems(){
        return Response.ok(menus).build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{mid : .+}")
    public Response getMenuItemsById(@PathParam("mid") int menuid){
            for(int i =0; i<menus.size(); i++)
                if (menus.get(i).getMenuid() == menuid)
                    return Response.ok(menus.get(i)).build();
            
            return Response.status(Response.Status.BAD_REQUEST).build(); 
    }
    
}
