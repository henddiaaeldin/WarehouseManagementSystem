package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.LoadUnit;
import com.developer.warehousemanagement.Service.LoadUnitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loadunit")
public class LoadUnitController {
    private final LoadUnitService loadUnitService;

    public LoadUnitController(LoadUnitService loadUnitService) {
        this.loadUnitService = loadUnitService;
    }

    @GetMapping
    public List<LoadUnit> findAllLoadUnit(){
        return loadUnitService.findAllLoadUnit();
    }
    @GetMapping("/{id}")
    public Optional<LoadUnit> findLoadUnitById(@PathVariable("id") Long id ){
        return loadUnitService.findbyId(id);
    }
    @PostMapping
    public LoadUnit saveLoadUnit(@RequestBody LoadUnit loadUnit){
        return loadUnitService.saveLoadUnit(loadUnit);
    }
    @PutMapping
    public LoadUnit updateLoadUnit(@RequestBody LoadUnit loadUnit){
        return loadUnitService.updateLoadUnit(loadUnit);
    }
    @DeleteMapping("/{id}")
    public void deleteLoadUnit(@PathVariable("id") Long id){
        loadUnitService.deleteLoadUnit(id);
    }

}
