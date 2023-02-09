package com.developer.warehousemanagement.Service;

import com.developer.warehousemanagement.Entity.LoadUnitStorage;

import java.util.List;
import java.util.Optional;

public interface LoadUnitStorageService {
    List<LoadUnitStorage> findAllLoadUnitStorage();
    Optional<LoadUnitStorage> findbyId(Long id);
    LoadUnitStorage saveLoadUnitStorage(LoadUnitStorage loadUnitStorage);
    LoadUnitStorage updateLoadUnitStorage(LoadUnitStorage loadUnitStorage);
}
