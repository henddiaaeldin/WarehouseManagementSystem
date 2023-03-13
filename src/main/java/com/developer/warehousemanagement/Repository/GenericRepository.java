package com.developer.warehousemanagement.Repository;

import com.developer.warehousemanagement.Entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T, Long> {
}
