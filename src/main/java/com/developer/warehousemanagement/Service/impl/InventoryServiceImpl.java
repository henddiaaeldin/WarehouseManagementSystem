package com.developer.warehousemanagement.Service.impl;

import com.developer.warehousemanagement.Entity.Advice;
import com.developer.warehousemanagement.Entity.Inventory;
import com.developer.warehousemanagement.Entity.SKU;
import com.developer.warehousemanagement.Entity.Stock;
import com.developer.warehousemanagement.Repository.GenericRepository;
import com.developer.warehousemanagement.Repository.InventoryRepository;
import com.developer.warehousemanagement.Repository.StockRepository;
import com.developer.warehousemanagement.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl extends GenericServiceImpl<Inventory> implements InventoryService {
    @Autowired
    protected StockRepository stockRepository;
    @Autowired
    protected InventoryRepository inventoryRepository;

    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    @Override
    public List<Stock> getStock() {
        try{
            return stockRepository.findAll();
        }
        catch (Exception e){
            throw e;
        }
    }

    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    @Override
    public List<SKU> findExpiredSku() {
        return inventoryRepository.findExpiredSku();
    }
}
