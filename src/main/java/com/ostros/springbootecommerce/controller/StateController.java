package com.ostros.springbootecommerce.controller;

import com.ostros.springbootecommerce.entity.State;
import com.ostros.springbootecommerce.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/states")
@CrossOrigin
public class StateController {

    @Autowired
    private StateService service;

    @GetMapping("/search/findByCountryCode")
    public List<State> findByCountryCode(@RequestParam(name = "code") String code){
        return service.getStatesByCountryCode(code);
    }
}
