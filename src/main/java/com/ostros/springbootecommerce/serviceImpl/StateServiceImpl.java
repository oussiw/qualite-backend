package com.ostros.springbootecommerce.serviceImpl;

import com.ostros.springbootecommerce.dao.StateRepository;
import com.ostros.springbootecommerce.entity.State;
import com.ostros.springbootecommerce.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository repository;

    @Override
    public List<State> getStatesByCountryCode(String countryCode) {
        return repository.findByCountryCode(countryCode);
    }
}
