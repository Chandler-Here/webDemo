package com.toman.webDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toman.webDemo.model.Product;
import com.toman.webDemo.repository.productRepository;

@Service
public class ProductService {

    @Autowired
    productRepository repo;


    // The below code is for testing REST API's through hardcoded data
    // Now Commenting the below lines to test for H2 JPA
    // List <Product> products = new ArrayList<>( Arrays.asList(
    //                     new Product(101,"Iphone",90000),
    //                     new Product(102,"AirPods",18000),
    //                     new Product(103,"IWatch",65000)
    //                     ));
    public List<Product> getProducts(){
       // return products;

       return repo.findAll();       
    }
    public Product getProductById(int prodId) {

        // return products.stream()
        //                 .filter(p -> p.getProdId() == prodId)
        //                 .findFirst().get();

        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product p) {
        //products.add(p);

        repo.save(p);
    }
    public void updateRecord(Product p) {
        // int index=0;

        // for(int i=0;i<products.size();i++)
        // {
        //     if (products.get(i).getProdId() == p.getProdId()) {
        //         index = i;
        //     }
        // }
        // products.set(index, p);

        // save is used for both creating and updating a new record in DB
        repo.save(p);
    }
    public void deleteRecord(int prodId) {

        // int index=0;

        // for(int i=0;i<products.size();i++)
        // {
        //     if (products.get(i).getProdId() == prodId) {
        //         index = i;
        //     }
        // }
        // products.remove(index);

        repo.deleteById(prodId);
        
    }
    
}
