package com.example.democrud.service;

import com.example.democrud.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product create(Product product);
    void delete(Long id);
}
