package com.castelocompany.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castelocompany.course_spring.entities.OrderItem;
import com.castelocompany.course_spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	

}
