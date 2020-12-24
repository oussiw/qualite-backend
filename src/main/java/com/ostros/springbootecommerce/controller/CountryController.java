package com.ostros.springbootecommerce.controller;


import com.ostros.springbootecommerce.entity.Country;
import com.ostros.springbootecommerce.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
@CrossOrigin
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("")
    public List<Country> getAll(){
        return service.getAll();
    }
}
