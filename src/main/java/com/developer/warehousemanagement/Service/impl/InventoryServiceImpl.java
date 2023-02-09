package com.developer.warehousemanagement.Service.impl;

import com.developer.warehousemanagement.Entity.Inventory;
import com.developer.warehousemanagement.Repository.InventoryRepository;
import com.developer.warehousemanagement.Service.InventoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryServiceImpl(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public List<Inventory> findAllInventory() {
        return inventoryRepository.findAll();
    }

    @Override
    public Optional<Inventory> findbyId(Long id) {
        return inventoryRepository.findById(id);
    }


    @Override
    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public Inventory updateInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }


}
