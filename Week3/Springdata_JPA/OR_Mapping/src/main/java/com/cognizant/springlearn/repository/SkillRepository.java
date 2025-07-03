// SkillRepository.java
package com.cognizant.springlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.springlearn.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
}
