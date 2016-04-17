/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Customer;
import edu.iit.cs445.s2016.aahmed22.delectable.repository.CustomerRepository;
import edu.iit.cs445.s2016.aahmed22.delectable.repository.CustomerRepositoryStub;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 *
 * @author adeeb
 */
@Path("customer")
public class CustomerResource {
    
    private CustomerRepository customerRepository = new CustomerRepositoryStub();
    
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public Response getAllCustomers(){
            List<Customer> customers = customerRepository.findAllCustomers();
            return Response.ok(customers).build();
        }

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        @Path("/{cid : .+}")
        public Response getSingleCustomer(@PathParam("cid") int customerid) {
            List<Customer> customers = customerRepository.findAllCustomers();
            for(int i = 0; i < customers.size(); i++)
                if(customers.get(i).getCustomerid()== customerid)
                    return Response.ok(customers.get(i)).build();
            return Response.ok("[{"+ customerid + "}, {No such customer exits}]").build();
        }
}
