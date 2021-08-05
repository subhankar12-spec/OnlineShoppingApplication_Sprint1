package com.cg.onlineshopping.controllers;


import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineshopping.entities.Order;
import com.cg.onlineshopping.exceptions.order.DateNotFoundException;
import com.cg.onlineshopping.exceptions.order.LocationNotFoundException;
import com.cg.onlineshopping.exceptions.order.OrderNotFoundException;
import com.cg.onlineshopping.exceptions.order.UserIdNotFoundException;
import com.cg.onlineshopping.services.IOrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	
    //private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	@Autowired
	private IOrderService orderService;
	
	@PostMapping("/order")
	public Order addOrder(@Valid @RequestBody Order order)
	{
		return orderService.addOrder(order);
	}
	
	@PutMapping("/order/{id}")
	public Order updateOrder(@PathVariable("id")Long id, @RequestBody Order order)
	{
		return orderService.updateOrder(id,order);
	}

	
	@GetMapping("/order/{id}")
	public Order viewOrder(@PathVariable("id")Long id) throws OrderNotFoundException {
		  return orderService.viewOrder(id);
	    
	}
	
	@DeleteMapping("/order/{id}")
	public Order removeOrder(@PathVariable("id")Long id) throws OrderNotFoundException {
		
    	return orderService.removeOrder(id);
    	
    }

	
	@GetMapping("/orders")
	public List<Order> viewAllOrders(){
	    	return orderService.viewAllOrders();
	    	
	}
	
	@GetMapping("/order/date/{date}")
	public List<Order> viewAllOrdersByDate(@PathVariable("date")@DateTimeFormat(iso=ISO.DATE) LocalDate date) throws DateNotFoundException{
	    	return orderService.viewAllOrdersByDate(date);
	    	
	}
	@GetMapping("/order/city/{city}")
	public List<Order> viewAllOrdersByLocation(@PathVariable("city")String city) throws LocationNotFoundException{
		return orderService.viewAllOrdersByLocation(city);
	}
	
	@GetMapping("/order/userId/{userId}")
	public List<Order> viewAllOrderByUserId(@PathVariable("userId")String userId) throws UserIdNotFoundException{
		return orderService.viewAllOrderByUserId(userId);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/order/{brandname}")
//     public List<Order> viewAllOrderByBrandName(@PathVariable("brandname")String brandName){
//    	 return orderService.viewAllOrderByBrandName(brandName);
//	 }
//	
//	@GetMapping("/order/{status}")
//	 public List<Order> viewAllOrderByStatus(@PathVariable("status")String status){
//		 return orderService.viewAllOrderByStatus(status);
//	 }
//	
//	@GetMapping("/order/{category}")
//	  public List<Order> viewAllOrderByProductCategory(@PathVariable("category")String category){
//		  return orderService.viewAllOrderByProductCategory(category);
//	  }

	
	

}
