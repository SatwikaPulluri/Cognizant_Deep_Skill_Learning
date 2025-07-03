package com.example.country.service;

import java.util.List;
import com.example.country.entity.Country;

public interface CountryService {
    Country findCountryByCode(String code);

    Country addCountry(Country country);

    Country updateCountry(String code, Country updatedCountry);

    void deleteCountry(String code);

    List<Country> findByPartialName(String name);
}
