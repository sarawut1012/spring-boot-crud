package com.example.democrud.service;

import com.example.democrud.model.Product;
import com.example.democrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return  repository.findAll();
    }

    @Override
    public Product create(Product product) {
        return  repository.save(product);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
