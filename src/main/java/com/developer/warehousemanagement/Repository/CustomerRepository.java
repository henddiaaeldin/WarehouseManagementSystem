package com.developer.warehousemanagement.Repository;

import com.developer.warehousemanagement.Entity.Advice;
import com.developer.warehousemanagement.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends GenericRepository<Customer>{
}
