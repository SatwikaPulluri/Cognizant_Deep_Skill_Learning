package com.cognizant.springlearn.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "skillList")
    private List<Employee> employeeList;

    // Getters and Setters
}
