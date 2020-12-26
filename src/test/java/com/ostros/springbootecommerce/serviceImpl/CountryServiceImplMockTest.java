package com.ostros.springbootecommerce.serviceImpl;

import com.ostros.springbootecommerce.dao.CountryRepository;
import com.ostros.springbootecommerce.dao.StateRepository;
import com.ostros.springbootecommerce.entity.Country;
import com.ostros.springbootecommerce.service.CountryService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

//@SpringBootTest(classes = MockitoJUnitRunner.class)
class CountryServiceImplMockTest {

    @Mock
    CountryRepository repository;

    @InjectMocks
    CountryServiceImpl service;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @DisplayName("Spring test Mockito for GetAll function ")
    @Test
    void testGetAllValid(){
        List<Country> expectedValues = new ArrayList<>();
        expectedValues.add(new Country("US","United States"));
        expectedValues.add(new Country("CA","Canada"));
        expectedValues.add(new Country("BR","Brazil"));
        expectedValues.add(new Country("DE","Germany"));
        expectedValues.add(new Country("TR","Turkey"));
        expectedValues.add(new Country("IN","India"));

        when(repository.findAll()).thenReturn(expectedValues);

        List<Country> actualValues = service.getAll();
        Assertions.assertEquals(expectedValues.size(),actualValues.size(),"Test passed");
        verify(repository,times(1)).findAll();
    }


}