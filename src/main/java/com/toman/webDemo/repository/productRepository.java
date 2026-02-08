package com.toman.webDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toman.webDemo.model.Product;


@Repository
public interface productRepository extends JpaRepository<Product, Integer> {

}
