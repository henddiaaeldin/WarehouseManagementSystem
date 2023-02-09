package com.developer.warehousemanagement.Service;

import com.developer.warehousemanagement.Entity.LoadUnit;

import java.util.List;
import java.util.Optional;

public interface LoadUnitService {
    List<LoadUnit> findAllLoadUnit();
    Optional<LoadUnit> findbyId(Long id);
    LoadUnit saveLoadUnit(LoadUnit loadUnit);
    LoadUnit updateLoadUnit(LoadUnit loadUnit);
    void deleteLoadUnit(Long id);
}
