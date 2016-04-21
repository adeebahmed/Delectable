/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Order;
import edu.iit.cs445.s2016.aahmed22.delectable.repository.OrderRepository;
import edu.iit.cs445.s2016.aahmed22.delectable.repository.OrderRepositoryStub;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author adeeb
 */
@Path("/orders")
public class OrderResource {
    private OrderRepository or = new OrderRepositoryStub();
    private List<Order> orders = or.getOrders();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrders(){
        return Response.ok(orders).build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{oid : .+}")
    public Response getOrderById(@PathParam("oid") int orderid){
        for(int i =0; i<orders.size(); i++)
            if (orders.get(i).getOrderid() == orderid)
                return Response.ok(orders.get(i)).build();

        return Response.status(Response.Status.NOT_FOUND).build(); //Response.ok("[{"+ orderid + "}, {No such report exits}]").build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getdate")
    public Response getOrderByDate(@QueryParam("date") String d){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        
        try {
              date = formatter.parse(d);
        } catch (ParseException ex) {
            Logger.getLogger(OrderResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (date != null){
            for(int i =0; i<orders.size(); i++)
                if (orders.get(i).getDate().getYear() == date.getYear() && orders.get(i).getDate().getMonth() == date.getMonth() && orders.get(i).getDate().getDay() == date.getDay())
                    return Response.ok(orders.get(i)).build();
        } 
        
        return Response.ok("[{"+ date + "}, {No such order exits}]").build();
    }
}
