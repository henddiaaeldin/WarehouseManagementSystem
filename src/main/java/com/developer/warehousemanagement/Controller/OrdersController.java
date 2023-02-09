package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.Orders;
import com.developer.warehousemanagement.Service.OrdersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    private final OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<Orders> findAllOrders(){
        return ordersService.findAllOrders();
    }
    @GetMapping("/{id}")
    public Optional<Orders> findOrdersById(@PathVariable("id") Long id ){
        return ordersService.findbyId(id);
    }
    @PostMapping
    public Orders saveOrders(@RequestBody Orders orders){
        return ordersService.saveOrders(orders);
    }
    @PutMapping
    public Orders updateOrders(@RequestBody Orders orders){
        return ordersService.updateOrders(orders);
    }

}
