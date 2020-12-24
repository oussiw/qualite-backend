package com.ostros.springbootecommerce.dao;

import com.ostros.springbootecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
