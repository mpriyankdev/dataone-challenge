package com.dataone.productservice.resource;

import com.dataone.productservice.entity.Product;
import com.dataone.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class ProductResource {

    @Autowired
    private ProductService productService;


    @GetMapping("/all")
    public ResponseEntity<Map<String, List<Product>>> getAllProducts(){

        productService.getAllProducts().sort(Comparator.comparing(product -> (product.getName())));
        //productService.getAllProducts().sort((p1,p2)-> p1.getName().compareTo(p2.getName()));

        Map<String, List<Product>> collect = productService.getAllProducts().stream().collect(Collectors.groupingBy(x -> x.getBrand()));
        return new ResponseEntity<>(collect , HttpStatus.ACCEPTED);

    }



}
