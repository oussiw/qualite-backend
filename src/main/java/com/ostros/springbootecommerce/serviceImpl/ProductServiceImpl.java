package com.ostros.springbootecommerce.serviceImpl;

import com.ostros.springbootecommerce.dao.ProductRepository;
import com.ostros.springbootecommerce.entity.Product;
import com.ostros.springbootecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Page<Product> getByCategoryId(Long id, Pageable pageable) {
        return repository.findByCategoryId(id,pageable);
    }

    @Override
    public Page<Product> getByNameContaining(String name, Pageable pageable) {
        return repository.findByNameContaining(name, pageable);
    }
}
