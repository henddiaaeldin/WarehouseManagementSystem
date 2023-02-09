package com.developer.warehousemanagement.Service.impl;

import com.developer.warehousemanagement.Entity.Orders;
import com.developer.warehousemanagement.Repository.OrdersRepository;
import com.developer.warehousemanagement.Service.OrdersService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersServiceImpl implements OrdersService {
    private final OrdersRepository ordersRepository;

    public OrdersServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<Orders> findAllOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public Optional<Orders> findbyId(Long id) {
        return ordersRepository.findById(id);
    }


    @Override
    public Orders saveOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public Orders updateOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

}
