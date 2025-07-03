package com.example.country.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.country.entity.Country;
import com.example.country.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country findCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    @Override
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country updateCountry(String code, Country updatedCountry) {
        Optional<Country> optional = countryRepository.findById(code);
        if (optional.isPresent()) {
            Country existing = optional.get();
            existing.setCoName(updatedCountry.getCoName());
            return countryRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    @Override
    public List<Country> findByPartialName(String name) {
        return countryRepository.findByCoNameContainingIgnoreCase(name);
    }
}
