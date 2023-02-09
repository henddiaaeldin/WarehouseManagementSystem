package com.developer.warehousemanagement.Service;
import com.developer.warehousemanagement.Entity.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryService {
    List<Inventory> findAllInventory();
    Optional<Inventory> findbyId(Long id);
    Inventory saveInventory(Inventory inventory);
    Inventory updateInventory(Inventory inventory);
}
