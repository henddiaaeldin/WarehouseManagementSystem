package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.SKU;
import com.developer.warehousemanagement.Service.SKUService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sku")
public class SKUController {
    private final SKUService skuService;

    public SKUController(SKUService skuService) {
        this.skuService = skuService;
    }

    @GetMapping
    public List<SKU> findAllSKU(){
        return skuService.findAllSKU();
    }
    @GetMapping("/{id}")
    public Optional<SKU> findSKUById(@PathVariable("id") Long id ){
        return skuService.findbyId(id);
    }
    @PostMapping
    public SKU saveSKU(@RequestBody SKU sku){
        return skuService.saveSKU(sku);
    }
    @PutMapping
    public SKU updateSKU(@RequestBody SKU sku){
        return skuService.updateSKU(sku);
    }
    @DeleteMapping("/{id}")
    public void deleteSKU(@PathVariable("id") Long id){
        skuService.deleteSKU(id);
    }

}
