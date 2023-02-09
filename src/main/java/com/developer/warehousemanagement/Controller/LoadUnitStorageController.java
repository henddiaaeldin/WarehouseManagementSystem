package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.LoadUnitStorage;
import com.developer.warehousemanagement.Service.LoadUnitStorageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loadunitstorage")
public class LoadUnitStorageController {
    private final LoadUnitStorageService loadUnitStorageService;

    public LoadUnitStorageController(LoadUnitStorageService loadUnitStorageService) {
        this.loadUnitStorageService = loadUnitStorageService;
    }

    @GetMapping
    public List<LoadUnitStorage> findAllLoadUnitStorage(){
        return loadUnitStorageService.findAllLoadUnitStorage();
    }
    @GetMapping("/{id}")
    public Optional<LoadUnitStorage> findLoadUnitStorageById(@PathVariable("id") Long id ){
        return loadUnitStorageService.findbyId(id);
    }
    @PostMapping
    public LoadUnitStorage saveLoadUnitStorage(@RequestBody LoadUnitStorage loadUnitStorage){
        return loadUnitStorageService.saveLoadUnitStorage(loadUnitStorage);
    }
    @PutMapping
    public LoadUnitStorage updateLoadUnitStorage(@RequestBody LoadUnitStorage loadUnitStorage){
        return loadUnitStorageService.updateLoadUnitStorage(loadUnitStorage);
    }

}
