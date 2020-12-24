package com.ostros.springbootecommerce.serviceImpl;

import com.ostros.springbootecommerce.dao.CountryRepository;
import com.ostros.springbootecommerce.entity.Country;
import com.ostros.springbootecommerce.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> getAll() {
        return repository.findAll();
    }
}
