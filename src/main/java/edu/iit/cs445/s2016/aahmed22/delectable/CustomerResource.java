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
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
}
