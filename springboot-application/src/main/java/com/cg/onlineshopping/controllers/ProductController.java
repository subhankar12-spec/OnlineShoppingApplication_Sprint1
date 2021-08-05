package com.cg.onlineshopping.controllers;

//import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineshopping.entities.Product;
import com.cg.onlineshopping.services.IProductService;


//import com.capg.spring.jpa.Tutorial;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
//@RequestMapping("/products")
public class ProductController {
	
//	@Autowired
//	IProductRepository iproductRepository;
	
	@Autowired(required=true)
	private IProductService iproductService;
	
//	final	IProductService iproductService;
//	public	ProductController(IProductService iproductService) {
//		this.iproductService=iproductService;
//	}
	
//	@PostMapping("/product")
//	  public ResponseEntity<Product> addProduct(@RequestBody Product product) {
//	    try {
//	      Product _product = iproductRepository
//	          .save(new Product(product.getProductId(),product.getProductName(),product.getBrandName(),product.getCategory(),product.getPrice(), product.getColor(),product.getSpecification(),product.getQuantity(),product.getUserRatings()));
//	      return new ResponseEntity<>(_product, HttpStatus.CREATED);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
	 
	@PostMapping("/product")
	  public ResponseEntity<Product> addProduct(@RequestBody Product product) {
	    return iproductService.addProduct(product);
	  }
//	@GetMapping("/product")
//	  public ResponseEntity<List<Product>> viewAllProducts(@RequestParam(required = false) String cat) {
//	    try {
//	      List<Product> product = new ArrayList<Product>();
//
//	      if (cat == null)
//	    	  iproductRepository.findAll().forEach(product::add);
//	      else
//	    	  iproductRepository.findByCategoryIgnoreCase(cat).forEach(product::add);
//
//	      if (product.isEmpty()) {
//	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	      }
//
//	      return new ResponseEntity<>(product, HttpStatus.OK);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
	 
	 @GetMapping("/product")
	  public ResponseEntity<List<Product>> viewProducts() {
	    return iproductService.viewAllProducts();
	  }

//	  @GetMapping("/product/{id}")
//	  public ResponseEntity<Product> getTutorialById(@PathVariable("id")String id) {
//	    Optional<Product> productData = iproductRepository.findById(id);
//
//	    if(productData.isPresent()) {
//	      return new ResponseEntity<>(productData.get(), HttpStatus.OK);
//	    } else {
//	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	    }
//	  }
	 
	 @GetMapping("/product/{id}")
	  public ResponseEntity<Product> viewProductById(@PathVariable("id")int id) {
	    return iproductService.viewProductById(id);
	  }
	  
//	  @GetMapping("/product/category/{cat}")
//	  public ResponseEntity<List<Product>> findByCategoryIgnoreCase(@PathVariable("cat")String cat) {
//	    List<Product> productData = iproductRepository.findByCategoryIgnoreCase(cat);
//		  //List<Product> product = new ArrayList<Product>();
//		  if (productData.isEmpty()) {
//		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		      }
//
//		      return new ResponseEntity<>(productData, HttpStatus.OK);
//	  }
	 
	 @GetMapping("/product/category/{cat}")
	  public ResponseEntity<List<Product>> viewProductsByCategory(@PathVariable("cat")String cat) {
	    return iproductService.viewProductsByCategory(cat);
	  }


//	  @PutMapping("/product/{id}")
//	  public ResponseEntity<Product> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
//	    Optional<Product> productData = iproductRepository.findById(id);
//
//	    if (productData.isPresent()) {
//	      Product _product = productData.get();
//	      
//	      _product.setProductName(product.getProductName());
//	      _product.setBrandName(product.getBrandName());
//	      _product.setCategory(product.getCategory());
//	      _product.setPrice(product.getPrice());
//	      _product.setColor(product.getColor());
//	      _product.setSpecification(product.getSpecification());
//	      _product.setQuantity(product.getQuantity());
//	      _product.setUserRatings(product.getUserRatings());
//	      return new ResponseEntity<>(iproductRepository.save(_product), HttpStatus.OK);
//	    } else {
//	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	    }
//	  }
	 
	 @PutMapping("/product/{id}")
	  public ResponseEntity<Product> updateProduct(@PathVariable("id") int id, @RequestBody Product product) {
	    return iproductService.updateProduct(id, product);
	  }

//	  @DeleteMapping("/product/{id}")
//	  public ResponseEntity<HttpStatus> removeProduct(@PathVariable("id") String id) {
//	    try {
//	    	iproductRepository.deleteById(id);
//	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
	 
	 @DeleteMapping("/product/{id}")
	  public ResponseEntity<HttpStatus> removeProduct(@PathVariable("id") int id) {
	    return iproductService.removeProduct(id);
	  }

//	  @DeleteMapping("/tutorials")
//	  public ResponseEntity<HttpStatus> deleteAllTutorials() {
//	    try {
//	    	iproductRepository.deleteAll();
//	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//
//	  }

//	  @GetMapping("/tutorials/published")
//	  public ResponseEntity<List<Tutorial>> findByPublished() {
//	    try {
//	      List<Tutorial> tutorials = iproductRepository.findByPublished(true);
//
//	      if (tutorials.isEmpty()) {
//	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	      }
//	      return new ResponseEntity<>(tutorials, HttpStatus.OK);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }

}