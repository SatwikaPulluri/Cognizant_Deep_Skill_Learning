package com.cognizant.springlearn;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringLearnApplication {

    @Autowired
    private CountryService countryService;

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }

    @PostConstruct
    public void testMethods() {
        getCountryByCodeTest();
        testAddCountry();
    }

    private void getCountryByCodeTest() {
        LOGGER.info("Start");
        try {
            Country country = countryService.findCountryByCode("IN");
            LOGGER.debug("Country: {}", country);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Exception: Country Not Found");
        }
        LOGGER.info("End");
    }

    private void testAddCountry() {
        LOGGER.info("Start Add Country");
        Country newCountry = new Country();
        newCountry.setCode("NP");
        newCountry.setName("Nepal");

        countryService.addCountry(newCountry);

        try {
            Country country = countryService.findCountryByCode("NP");
            LOGGER.debug("Added Country: {}", country);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Exception: Country Not Found");
        }
        LOGGER.info("End Add Country");
    }
}
