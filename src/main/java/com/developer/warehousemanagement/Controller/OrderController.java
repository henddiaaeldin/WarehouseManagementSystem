package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController extends GenericController<Order> {

}
