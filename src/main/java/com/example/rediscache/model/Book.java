package com.example.rediscache.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity  
public class Book implements Serializable {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
    private String name;  
    private String description;  
    private BigDecimal price;  
}  
