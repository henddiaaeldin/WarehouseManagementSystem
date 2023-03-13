package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.SKU;
import com.developer.warehousemanagement.Entity.Stock;
import com.developer.warehousemanagement.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController extends GenericController<Stock> {
    @Autowired
    private InventoryService inventoryService;
    @GetMapping("/Stock")
    public List<Stock> getStock() throws Exception {
        return (List<Stock>) inventoryService.getStock();
    }

    @GetMapping("/ExpiredItems")
    public List<SKU> getExpiredSKU() throws Exception {
        return (List<SKU>) inventoryService.findExpiredSku();
    }
}
