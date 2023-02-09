package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.Supplier;
import com.developer.warehousemanagement.Service.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping
    public List<Supplier> findAllSupplier(){
        return supplierService.findAllSupplier();
    }
    @GetMapping("/{id}")
    public Optional<Supplier> findSupplierById(@PathVariable("id") Long id ){
        return supplierService.findbyId(id);
    }
    @PostMapping
    public Supplier saveSupplier(@RequestBody Supplier supplier){
        return supplierService.saveSupplier(supplier);
    }
    @PutMapping
    public Supplier updateSupplier(@RequestBody Supplier supplier){
        return supplierService.updateSupplier(supplier);
    }
    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable("id") Long id){
        supplierService.deleteSupplier(id);
    }

}
