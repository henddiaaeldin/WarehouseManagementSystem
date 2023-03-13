package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController extends GenericController<Address> {
}
