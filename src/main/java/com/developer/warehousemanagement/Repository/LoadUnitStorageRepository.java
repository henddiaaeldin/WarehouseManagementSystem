package com.developer.warehousemanagement.Repository;

import com.developer.warehousemanagement.Entity.LoadUnitStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadUnitStorageRepository extends JpaRepository<LoadUnitStorage,Long> {
}
