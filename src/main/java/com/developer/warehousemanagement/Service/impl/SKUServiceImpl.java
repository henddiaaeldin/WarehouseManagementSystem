package com.developer.warehousemanagement.Service.impl;

import com.developer.warehousemanagement.Entity.SKU;
import com.developer.warehousemanagement.Repository.SKURepository;
import com.developer.warehousemanagement.Service.SKUService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SKUServiceImpl implements SKUService {
    private final SKURepository skuRepository;

    public SKUServiceImpl(SKURepository skuRepository) {
        this.skuRepository = skuRepository;
    }

    @Override
    public List<SKU> findAllSKU() {
        return skuRepository.findAll();
    }

    @Override
    public Optional<SKU> findbyId(Long id) {
        return skuRepository.findById(id);
    }


    @Override
    public SKU saveSKU(SKU sku) {
        return skuRepository.save(sku);
    }

    @Override
    public SKU updateSKU(SKU sku) {
        return skuRepository.save(sku);
    }

    @Override
    public void deleteSKU(Long id) {
        skuRepository.deleteById(id);
    }
}
