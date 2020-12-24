package com.ostros.springbootecommerce.serviceImpl;

import com.ostros.springbootecommerce.service.CountryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CountryServiceImplTest {

    @Autowired
    private CountryService service;

    @DisplayName("Spring test for GetAll function when number of countries returned equals 6")
    @Test
    void testGetAllValid(){
//Just testing how many countries are we gonna get.
        Assertions.assertEquals(6,service.getAll().size(),"Test passed");
    }

    @DisplayName("Spring test for GetAll function when number of countries returned is different from 6")
    @Test
    void testGetAllNotValid(){
        Assertions.assertNotEquals(1,service.getAll().size(),"Test passed");
    }
}