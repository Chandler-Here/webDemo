package com.toman.webDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.toman.webDemo.model.Product;

@Service
public class ProductService {

    List <Product> products = new ArrayList<>( Arrays.asList(
                        new Product(101,"Iphone",90000),
                        new Product(102,"AirPods",18000),
                        new Product(103,"IWatch",65000)
                        ));
    public List<Product> getProducts(){
        return products;
    }
    public Product getProductById(int prodId) {

        return products.stream()
                        .filter(p -> p.getProdId() == prodId)
                        .findFirst().get();
    }
    public void addProduct(Product p) {
        products.add(p);
    }
    public void updateRecord(Product p) {
        int index=0;

        for(int i=0;i<products.size();i++)
        {
            if (products.get(i).getProdId() == p.getProdId()) {
                index = i;
            }
        }
        products.set(index, p);
    }
    public void deleteRecord(int prodId) {

        int index=0;

        for(int i=0;i<products.size();i++)
        {
            if (products.get(i).getProdId() == prodId) {
                index = i;
            }
        }
        products.remove(index);
        
    }
    
}
