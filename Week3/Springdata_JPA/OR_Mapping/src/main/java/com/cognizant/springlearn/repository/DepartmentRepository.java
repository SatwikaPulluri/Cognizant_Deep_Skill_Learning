// DepartmentRepository.java
package com.cognizant.springlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.springlearn.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
