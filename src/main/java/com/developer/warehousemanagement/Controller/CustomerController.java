package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController extends GenericController<Customer> {

}
