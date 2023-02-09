package com.developer.warehousemanagement.Repository;

import com.developer.warehousemanagement.Entity.SKU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SKURepository extends JpaRepository<SKU,Long> {

}
