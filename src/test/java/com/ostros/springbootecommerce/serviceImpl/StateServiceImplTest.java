package com.ostros.springbootecommerce.serviceImpl;

import com.ostros.springbootecommerce.entity.State;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StateServiceImplTest {

    @Autowired
    private StateServiceImpl service;

    @DisplayName("Spring test for GetStatesByCountryCode function when country codes are valid -US-BR-CA-")
    @Test
    void testGetStatesByCountryCodeValid(){
        int[] expectedValues= {51,27,13};
        int[] actualValues= {
                service.getStatesByCountryCode("us").size(),
                service.getStatesByCountryCode("br").size(),
                service.getStatesByCountryCode("ca").size()
        };
        Assertions.assertArrayEquals(expectedValues,actualValues);
    }

    @DisplayName("\n\nSpring test for GetStatesByCountryCode function when country codes aren't valid -USS-BRR-CAA-")
    @Test
    void testGetStatesByCountryCodeNotValid(){
        int[] expectedValues= {51,27,13};
        int[] actualValues= {
                service.getStatesByCountryCode("uss").size(),
                service.getStatesByCountryCode("brr").size(),
                service.getStatesByCountryCode("caa").size()
        };
        Assertions.assertArrayEquals(expectedValues,actualValues);
    }

    @DisplayName("\n\nSpring test for GetStatesByCountryCode function when output value doesn't match the expected value")
    @Test
    void testGetStatesByCountryCodeWrongOutputValues(){
        int[] expectedValues= {51,27,13};
        int[] actualValues= {
                service.getStatesByCountryCode("br").size(),
                service.getStatesByCountryCode("ca").size(),
                service.getStatesByCountryCode("us").size()
        };
        Assertions.assertArrayEquals(expectedValues,actualValues);
    }

}