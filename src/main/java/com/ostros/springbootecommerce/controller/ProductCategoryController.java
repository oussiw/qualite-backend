package com.ostros.springbootecommerce.controller;

import com.ostros.springbootecommerce.entity.ProductCategory;
import com.ostros.springbootecommerce.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product-category")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService service;

    @GetMapping("")
    public List<ProductCategory> getAll(){
        return service.getAll();
    }
}
