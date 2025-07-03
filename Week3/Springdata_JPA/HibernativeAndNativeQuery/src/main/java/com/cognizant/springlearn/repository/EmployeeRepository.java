package com.cognizant.springlearn.repository;

import com.cognizant.springlearn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByDepartment(String department);

    List<Employee> findBySalaryGreaterThan(double salary);

    @Query(value = "SELECT * FROM employee ORDER BY salary DESC LIMIT 1", nativeQuery = true)
    Employee findTopEmployeeNative();
}
