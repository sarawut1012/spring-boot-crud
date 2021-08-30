package com.example.democrud.controller;

import com.example.democrud.model.Product;
import com.example.democrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products")
    public ResponseEntity<List<Product>> products() {
             List<Product> list = productService.findAll();
             return  new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/product")
    public  Product product(@RequestBody Product product) {
        return  productService.create(product);
    }
    @PutMapping("/product/{id}")
    public Product product(@PathVariable("id") Long id, @RequestBody Product product) {
        product.setId(id);
        return  productService.create(product);
    }

    @DeleteMapping("product/{id}")
    public void product(@PathVariable("id") Long id) {
        productService.delete(id);
    }


}
