package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> getByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    @Override
    public List<Employee> getWithHighSalary() {
        return employeeRepository.findBySalaryGreaterThan(50000);
    }

    @Override
    public Employee getTopEmployeeNative() {
        return employeeRepository.findTopEmployeeNative();
    }
}
