package com.developer.warehousemanagement.Repository;

import com.developer.warehousemanagement.Entity.Advice;
import com.developer.warehousemanagement.Entity.Inventory;
import com.developer.warehousemanagement.Entity.SKU;
import com.developer.warehousemanagement.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends GenericRepository<Inventory> {
    @Query("SELECT s FROM SKU s WHERE s.expirationDate <= CURRENT_DATE")
    List<SKU> findExpiredSku();

}
