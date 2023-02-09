package com.developer.warehousemanagement.Service;

import com.developer.warehousemanagement.Entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAllCustomer();
    Optional<Customer> findbyId(Long id);
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long id);
}
