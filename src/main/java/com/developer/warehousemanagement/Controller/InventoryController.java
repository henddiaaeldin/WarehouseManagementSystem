package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.Inventory;
import com.developer.warehousemanagement.Service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping
    public List<Inventory> findAllInventory(){
        return inventoryService.findAllInventory();
    }
    @GetMapping("/{id}")
    public Optional<Inventory> findInventoryById(@PathVariable("id") Long id ){
        return inventoryService.findbyId(id);
    }
    @PostMapping
    public Inventory saveInventory(@RequestBody Inventory inventory){
        return inventoryService.saveInventory(inventory);
    }
    @PutMapping
    public Inventory updateInventory(@RequestBody Inventory inventory){
        return inventoryService.updateInventory(inventory);
    }

}
