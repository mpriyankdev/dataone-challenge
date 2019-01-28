package com.dataone.productservice.repository;

import com.dataone.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductRepository extends JpaRepository<Product , Integer> {
}
