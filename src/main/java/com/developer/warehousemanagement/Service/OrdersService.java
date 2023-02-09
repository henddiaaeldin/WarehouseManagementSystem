package com.developer.warehousemanagement.Service;

import com.developer.warehousemanagement.Entity.Orders;

import java.util.List;
import java.util.Optional;

public interface OrdersService {
    List<Orders> findAllOrders();
    Optional<Orders> findbyId(Long id);
    Orders saveOrders(Orders orders);
    Orders updateOrders(Orders orders);
}
