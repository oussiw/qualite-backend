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

    @DisplayName("Spring test for GetStatesByCountryCode function for country code -US-BR-CA-")
    @Test
    void testGetStatesByCountryCodeValide(){
        int[] expectedValues= {51,27,13};
        int[] actualValues= {
                service.getStatesByCountryCode("us").size(),
                service.getStatesByCountryCode("br").size(),
                service.getStatesByCountryCode("ca").size()
        };
        Assertions.assertArrayEquals(expectedValues,actualValues);
    }

    @DisplayName("\n\nSpring test for GetStatesByCountryCode function for country code -BR-")
    @Test
    void testGetStatesByCountryCodeNotValide(){
        int[] expectedValues= {51,27,13};
        int[] actualValues= {
                service.getStatesByCountryCode("br").size(),
                service.getStatesByCountryCode("ca").size(),
                service.getStatesByCountryCode("us").size()
        };
        Assertions.assertArrayEquals(expectedValues,actualValues);
    }

}