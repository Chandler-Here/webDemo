package com.toman.webDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//Added Entity Annotation for creation of columns in DB
public class Product {

    //Adding Id tag for prodId field to make it as primary key in the table
    @Id
    private int prodId;
    private String prodName;
    private int prodPrice;
    
}
