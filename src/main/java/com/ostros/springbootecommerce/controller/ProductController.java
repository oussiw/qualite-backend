package com.ostros.springbootecommerce.controller;


import com.ostros.springbootecommerce.entity.Product;
import com.ostros.springbootecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/search/findByCategoryId")
    public Page<Product> findByCategoryId(@RequestParam Long id,@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "5") int size) {
        return service.getByCategoryId(id, PageRequest.of(page,size));
    }

    @GetMapping("/search/findByNameContaining")
    public Page<Product> findByNameContaining(@RequestParam String name,@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "5") int size) {
        return service.getByNameContaining(name, PageRequest.of(page,size));
    }
}
