package com.ostros.springbootecommerce.serviceImpl;

import com.ostros.springbootecommerce.dao.CountryRepository;
import com.ostros.springbootecommerce.dao.StateRepository;
import com.ostros.springbootecommerce.entity.Country;
import com.ostros.springbootecommerce.service.CountryService;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@SpringBootTest
class CountryServiceImplMockTest {

    @Mock
    private CountryRepository repository;

    @InjectMocks
    private CountryService service = new CountryServiceImpl();

//    @MockBean
//    private CountryRepository repository;
//
//    @Autowired
//    private CountryService service;

    @DisplayName("Spring test Mockito for GetAll function ")
    @Test
    void testGetAllValid(){
        List<Country> expectedValues = new ArrayList<>();

        doReturn(expectedValues).when(repository).findAll();

        List<Country> actualValues = service.getAll();
        Assertions.assertEquals(expectedValues.size(),actualValues.size(),"Test passed");
    }


}