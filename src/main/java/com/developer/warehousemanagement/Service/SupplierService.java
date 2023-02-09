package com.developer.warehousemanagement.Service;

import com.developer.warehousemanagement.Entity.Supplier;

import java.util.List;
import java.util.Optional;

public interface SupplierService {
    List<Supplier> findAllSupplier();
    Optional<Supplier> findbyId(Long id);
    Supplier saveSupplier(Supplier supplier);
    Supplier updateSupplier(Supplier supplier);
    void deleteSupplier(Long id);
}
