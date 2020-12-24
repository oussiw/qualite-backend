package com.ostros.springbootecommerce.dao;


import com.ostros.springbootecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
