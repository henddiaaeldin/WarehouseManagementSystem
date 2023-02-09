package com.developer.warehousemanagement.Service.impl;

import com.developer.warehousemanagement.Entity.LoadUnit;
import com.developer.warehousemanagement.Repository.LoadUnitRepository;
import com.developer.warehousemanagement.Service.LoadUnitService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadUnitServiceImpl implements LoadUnitService {
    private final LoadUnitRepository loadUnitRepository;

    public LoadUnitServiceImpl(LoadUnitRepository loadUnitRepository) {
        this.loadUnitRepository = loadUnitRepository;
    }

    @Override
    public List<LoadUnit> findAllLoadUnit() {
        return loadUnitRepository.findAll();
    }

    @Override
    public Optional<LoadUnit> findbyId(Long id) {
        return loadUnitRepository.findById(id);
    }


    @Override
    public LoadUnit saveLoadUnit(LoadUnit loadUnit) {
        return loadUnitRepository.save(loadUnit);
    }

    @Override
    public LoadUnit updateLoadUnit(LoadUnit loadUnit) {
        return loadUnitRepository.save(loadUnit);
    }

    @Override
    public void deleteLoadUnit(Long id) {
        loadUnitRepository.deleteById(id);
    }
}
