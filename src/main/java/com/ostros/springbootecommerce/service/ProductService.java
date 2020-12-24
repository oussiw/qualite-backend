package com.ostros.springbootecommerce.service;


import com.ostros.springbootecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    Page<Product> getByCategoryId(Long id, Pageable pageable);

    Page<Product> getByNameContaining(String name, Pageable pageable);
}
