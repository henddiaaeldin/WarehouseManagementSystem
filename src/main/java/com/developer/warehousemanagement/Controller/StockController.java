package com.developer.warehousemanagement.Controller;
import com.developer.warehousemanagement.Entity.Stock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController extends GenericController<Stock>{
}
