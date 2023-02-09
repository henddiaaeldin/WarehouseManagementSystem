package com.developer.warehousemanagement.Service;

import com.developer.warehousemanagement.Entity.Advice;

import java.util.List;
import java.util.Optional;

public interface AdviceService {
List<Advice> findAllAdvice();
Optional<Advice> findbyId(Long id);
Advice saveAdvice(Advice advice);
Advice updateAdvice(Advice advice);
}
