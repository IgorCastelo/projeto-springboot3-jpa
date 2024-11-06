package com.castelocompany.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castelocompany.course_spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
