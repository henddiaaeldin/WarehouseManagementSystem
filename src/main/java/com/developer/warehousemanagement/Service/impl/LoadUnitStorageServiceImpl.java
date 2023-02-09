package com.developer.warehousemanagement.Service.impl;

import com.developer.warehousemanagement.Entity.LoadUnitStorage;
import com.developer.warehousemanagement.Repository.LoadUnitStorageRepository;
import com.developer.warehousemanagement.Service.LoadUnitStorageService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadUnitStorageServiceImpl implements LoadUnitStorageService {
    private final LoadUnitStorageRepository loadUnitStorageRepository;

    public LoadUnitStorageServiceImpl(LoadUnitStorageRepository loadUnitStorageRepository) {
        this.loadUnitStorageRepository = loadUnitStorageRepository;
    }

    @Override
    public List<LoadUnitStorage> findAllLoadUnitStorage() {
        return loadUnitStorageRepository.findAll();
    }

    @Override
    public Optional<LoadUnitStorage> findbyId(Long id) {
        return loadUnitStorageRepository.findById(id);
    }


    @Override
    public LoadUnitStorage saveLoadUnitStorage(LoadUnitStorage loadUnitStorage) {
        return loadUnitStorageRepository.save(loadUnitStorage);
    }

    @Override
    public LoadUnitStorage updateLoadUnitStorage(LoadUnitStorage loadUnitStorage) {
        return loadUnitStorageRepository.save(loadUnitStorage);
    }

}
