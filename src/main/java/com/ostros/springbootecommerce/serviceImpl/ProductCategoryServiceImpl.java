package com.ostros.springbootecommerce.serviceImpl;

import com.ostros.springbootecommerce.dao.ProductCategoryRepository;
import com.ostros.springbootecommerce.entity.ProductCategory;
import com.ostros.springbootecommerce.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public List<ProductCategory> getAll() {
        return repository.findAll();
    }
}
