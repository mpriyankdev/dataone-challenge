package com.dataone.productservice.service;

import com.dataone.productservice.entity.Product;
import com.dataone.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts(){


        repository.findAll().forEach(x -> System.out.println(x));

        return repository.findAll();
    }

}
