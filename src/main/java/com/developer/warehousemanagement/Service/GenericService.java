package com.developer.warehousemanagement.Service;

import com.developer.warehousemanagement.Entity.BaseEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface GenericService <T extends BaseEntity>  {

    List<T> findAll() throws Exception;
    Optional<T> findbyId(Long id) throws Exception;
    T save(T entity) throws Exception;
    T update(T entity) throws Exception;
    ResponseEntity<String> delete(Long id) throws Exception;


}
