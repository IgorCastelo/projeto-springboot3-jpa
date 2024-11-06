package com.castelocompany.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castelocompany.course_spring.entities.Category;
import com.castelocompany.course_spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}