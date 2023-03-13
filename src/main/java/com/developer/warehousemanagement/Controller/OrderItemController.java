package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.Order;
import com.developer.warehousemanagement.Entity.OrderItem;
import com.developer.warehousemanagement.Repository.OrderItemRespository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders/items")
public class OrderItemController extends GenericController<OrderItem> {


}
