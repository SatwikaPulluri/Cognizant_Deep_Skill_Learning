package com.example.country.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.country.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByCoNameContainingIgnoreCase(String name);
}
