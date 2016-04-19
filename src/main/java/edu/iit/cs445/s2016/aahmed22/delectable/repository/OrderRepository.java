/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.repository;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Order;
import java.util.List;

/**
 *
 * @author adeeb
 */
public interface OrderRepository {

    List<Order> getOrders();
    
}
