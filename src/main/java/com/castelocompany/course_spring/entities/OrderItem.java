package com.castelocompany.course_spring.entities;

import java.io.Serializable;
import java.util.Objects;

import com.castelocompany.course_spring.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_order_item")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();

	private Integer quantity;
	private Double price;

	public OrderItem() {

	}

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	                            // tem que colocar no metodo get da coleção, pois o java so reconehce nesse metodo
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {//inserido manualmente assim como no construtor
		 
		id.setOrder(order);
	}
	
	public Product getProduct() {//inserido manualmente assim como no construtor
		return id.getProduct();
	}
	
	public void setProduct(Product product) {//inserido manualmente assim como no construtor
		id.setProduct(product);
	}
	
	public Integer getQuantity() {//inserido manualmente assim como no construtor
		return quantity;
	}

	public void setQuabtity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}

}
