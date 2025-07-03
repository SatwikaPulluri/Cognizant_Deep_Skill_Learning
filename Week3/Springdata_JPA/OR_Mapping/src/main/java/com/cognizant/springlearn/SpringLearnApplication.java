package com.cognizant.springlearn;

import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }

    @PostConstruct
    public void test() {
        LOGGER.info("Fetching Employee with ID 1");
        Optional<Employee> emp = employeeRepository.findById(1);

        if (emp.isPresent()) {
            LOGGER.info("Employee Found: {}", emp.get());
        } else {
            LOGGER.warn("Employee with ID 1 not found.");
        }
    }
}
