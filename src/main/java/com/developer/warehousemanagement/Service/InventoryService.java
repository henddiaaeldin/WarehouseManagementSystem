package com.developer.warehousemanagement.Service;
import com.developer.warehousemanagement.Entity.Advice;
import com.developer.warehousemanagement.Entity.Inventory;
import com.developer.warehousemanagement.Entity.SKU;
import com.developer.warehousemanagement.Entity.Stock;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface InventoryService extends GenericService<Inventory>{
List<Stock> getStock();
List<SKU> findExpiredSku();
}
