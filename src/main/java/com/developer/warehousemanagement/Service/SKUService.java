package com.developer.warehousemanagement.Service;

import com.developer.warehousemanagement.Entity.SKU;

import java.util.List;
import java.util.Optional;

public interface SKUService {
    List<SKU> findAllSKU();
    Optional<SKU> findbyId(Long id);
    SKU saveSKU(SKU sku);
    SKU updateSKU(SKU sku);
    void deleteSKU(Long id);
}
