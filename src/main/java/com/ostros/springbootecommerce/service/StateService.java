package com.ostros.springbootecommerce.service;

import com.ostros.springbootecommerce.entity.State;

import java.util.List;

public interface StateService {
    List<State> getStatesByCountryCode(String countryCode);
}
