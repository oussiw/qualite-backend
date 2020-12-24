package com.ostros.springbootecommerce.serviceImpl;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductCategoryServiceImplTest {

    @Autowired
    private ProductCategoryServiceImpl service;

    @DisplayName("Spring test for GetAll function when number of categories returned equals 4")
    @Test
    void testGetAllValid(){
        Assertions.assertEquals(4,service.getAll().size(),"Test passed");
    }

    @DisplayName("Spring test for GetAll function when number of categories returned is different from 4")
    @Test
    void testGetAllNotValid(){
        Assertions.assertNotEquals(12,service.getAll().size(),"Test passed");
    }
}