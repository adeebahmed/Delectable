/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.repository;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adeeb
 */
public class CustomerRepositoryStub implements CustomerRepository {
    
    public List<Customer> findAllCustomers(){
        
        List<Customer> customers = new ArrayList<Customer>();
        Customer c1 = new Customer(0,"John", "doe","6303409897", "johndoe@gmail.com");
        Customer c2 = new Customer(1,"Jane", "doe","6303409897", "janedoe@gmail.com");
        customers.add(c1);
        customers.add(c2);
        
        return customers;
    }
}
