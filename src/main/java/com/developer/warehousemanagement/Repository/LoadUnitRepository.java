package com.developer.warehousemanagement.Repository;

import com.developer.warehousemanagement.Entity.LoadUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadUnitRepository extends JpaRepository<LoadUnit,Long> {
}
