package com.domss.PurchaseOrder.service;

import com.domss.PurchaseOrder.entity.Product;
import com.domss.PurchaseOrder.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
