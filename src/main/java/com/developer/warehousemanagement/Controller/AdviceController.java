package com.developer.warehousemanagement.Controller;

import com.developer.warehousemanagement.Entity.Advice;
import com.developer.warehousemanagement.Service.AdviceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/advice")
public class AdviceController {
    private final AdviceService adviceService;

    public AdviceController(AdviceService adviceService) {
        this.adviceService = adviceService;
    }

    @GetMapping
    public List<Advice> findAllAdvice(){
        return adviceService.findAllAdvice();
    }
    @GetMapping("/{id}")
    public Optional<Advice> findAdviceById(@PathVariable("id") Long id ){
        return adviceService.findbyId(id);
    }
    @PostMapping
    public Advice saveAdvice(@RequestBody Advice advice){
        return adviceService.saveAdvice(advice);
    }
    @PutMapping
    public Advice updateAdvice(@RequestBody Advice advice){
        return adviceService.updateAdvice(advice);
    }

}
