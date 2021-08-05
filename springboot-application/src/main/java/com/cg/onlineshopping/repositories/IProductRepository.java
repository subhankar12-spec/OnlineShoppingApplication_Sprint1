package com.cg.onlineshopping.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineshopping.entities.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer>{
	
	public List<Product> findByCategoryIgnoreCase(String cat);
	
//	public List<Product> viewAllProducts();
//	 public Product addProduct(Product product);
//	 public Product updateProduct(Product product);
//	 public Product viewProduct(int id);
//	 public List<Product> viewProductsByCategory(String cat); 
//	 public Product removeProduct(String prodid);
}