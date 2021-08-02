package com.cg.onlineshopping.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;

@Builder
@Entity
@Table(name="ProductList")
public class ProductList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="List_Id")
	private Long listId;
	@Column(name="ProductName")
	private String productName;
	@Column(name="Quantity")
	private int quantity;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Fk_prod_id")
	private Product product;

	public Long getListId() {
		return listId;
	}

	public void setListId(Long listId) {
		this.listId = listId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public ProductList() {
		
	}

	public ProductList(Long listId, String productName, int quantity, Product product) {
		super();
		this.listId = listId;
		this.productName = productName;
		this.quantity = quantity;
		this.product = product;
	}
	
	
	


}
