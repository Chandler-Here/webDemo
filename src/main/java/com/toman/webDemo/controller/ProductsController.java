package com.toman.webDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toman.webDemo.model.Product;
import com.toman.webDemo.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class ProductsController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> showProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product p){
        System.out.println("Adding product: " + p);
        service.addProduct(p);
    }

    @PutMapping("/products")
    public Product updateRecord(@RequestBody Product p){
        service.updateRecord(p);
        return p;
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteRecord(@PathVariable int prodId){
        service.deleteRecord(prodId);
    }
    
}