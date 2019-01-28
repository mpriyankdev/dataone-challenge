package com.dataone.productservice.config;

import com.dataone.productservice.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public ProductService service(){
        return new ProductService();
    }

}
