package com.domss.PurchaseOrder.controller;

import com.domss.PurchaseOrder.entity.Product;
import com.domss.PurchaseOrder.repository.ProductRepository;
import com.domss.PurchaseOrder.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String greetings(){
        return "Welcome Message...";
    }

    @GetMapping("/get")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
}
