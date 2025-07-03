package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    List<Employee> getByDepartment(String department);

    List<Employee> getWithHighSalary();

    Employee getTopEmployeeNative();
}
