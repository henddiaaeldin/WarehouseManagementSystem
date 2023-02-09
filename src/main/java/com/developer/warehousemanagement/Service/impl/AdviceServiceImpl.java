package com.developer.warehousemanagement.Service.impl;

import com.developer.warehousemanagement.Entity.Advice;
import com.developer.warehousemanagement.Repository.AdviceRepository;
import com.developer.warehousemanagement.Service.AdviceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdviceServiceImpl implements AdviceService {
    private final AdviceRepository adviceRepository;

    public AdviceServiceImpl(AdviceRepository adviceRepository) {
        this.adviceRepository = adviceRepository;
    }

    @Override
    public List<Advice> findAllAdvice() {
        return adviceRepository.findAll();
    }

    @Override
    public Optional<Advice> findbyId(Long id) {
        return adviceRepository.findById(id);
    }

    @Override
    public Advice saveAdvice(Advice advice) {
        return adviceRepository.save(advice);
    }

    @Override
    public Advice updateAdvice(Advice advice) {
        return adviceRepository.save(advice);
    }
}
