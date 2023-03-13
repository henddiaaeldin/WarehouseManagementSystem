package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.BaseEntity;
import com.developer.warehousemanagement.Service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class GenericController <T extends BaseEntity>{
    @Autowired
    private GenericService<T> genericService;
    @GetMapping
    public List<T> findAll() throws Exception {
        return (List<T>) genericService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<T> findById(@PathVariable("id") Long id ) throws Exception {
        return genericService.findbyId(id);
    }
    @PostMapping
    public T save(@RequestBody T entity) throws Exception {
        return genericService.save(entity);
    }
    @PutMapping
    public T update(@RequestBody T entity) throws Exception {
        return genericService.update(entity);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) throws Exception {
            return genericService.delete(id);
    }

    public GenericService<T> getGenericService() {
        return genericService;
    }
}
