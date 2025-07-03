package com.cognizant.springlearn;

import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }

    @PostConstruct
    public void runQueries() {
        System.out.println("All Employees: " + employeeService.getAllEmployees());
        System.out.println("By Department: " + employeeService.getByDepartment("HR"));
        System.out.println("Employees With Salary > 50000: " + employeeService.getWithHighSalary());
        System.out.println("Native Query (Top 1): " + employeeService.getTopEmployeeNative());
    }
}
