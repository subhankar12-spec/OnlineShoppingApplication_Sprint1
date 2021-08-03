package com.cg.onlineshopping.service;
//package com.capg.OnlineShop.testing;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentMatchers;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.capg.OnlineShop.Exception.CustomerNotFoundException;
//import com.capg.OnlineShop.entities.Customer;
//import com.capg.OnlineShop.repository.ICustomerRepository;
//import com.capg.OnlineShop.service.ICustomerService;
//
//
//
//@SpringBootTest
//public class CustServImplTest {
//	
//	@MockBean
//	private ICustomerRepository CustRepo;
//	@Autowired
//	private ICustomerService service;
//	
//	@BeforeEach
//	void setup () throws Exception
//	{
//		Customer cust1=Customer.builder().customerId(1).firstName("Rohit").lastName("Roy").mobileNumber("1234567890").status("Active").build();
//		Optional<Customer> opt= Optional.of(cust1);
//		Mockito.when(CustRepo.findById(1)).thenReturn(opt);
//		
////		Customer cust2=Customer.builder().customerId(1).firstName("Rohit").lastName("Roy").mobileNumber("1234567890").status("Active").build();
////		Optional<Customer> opt1= Optional.of(cust2);
////		Mockito.when(CustRepo.findById(1)).thenReturn(opt1);
//		
////		Customer cust1=Customer.builder().customerId(1).firstName("Rohit").lastName("Roy").mobileNumber("1234567890").status("Active").build();
////		Mockito.when(CustRepo.FindByFirstName("Rohit")).thenReturn(cust1);
//	}
//	
//	@Test
//	void GetCustByIdTest() throws CustomerNotFoundException
//	{
//		int id=1;
//		Customer cs=service.viewCustomer(id);
//		assertEquals(id, cs.getCustomerId());
//	}
//	
////	@Test
////	void SaveCustomerTest()
////	{
////		Customer cust = new Customer(1,"Rohit","Roy","1234567890","Active");
//////		.setName(“Test Name”);
////		when(CustRepo.save(ArgumentMatchers.any(Customer.class))).thenReturn(cust);
////		Customer created = service.addCustomer(cust);
////		when(created.getFirstName()).thenReturn(cust.getFirstName());
////		verify(CustRepo).save(cust);
////	}
//	
//	@Test
//	void GetAllCustTest()
//	{
//	
//		List<Customer> cust = new ArrayList();
//		cust.add(new Customer(1,"Rohit","Roy","1234567890","Active"));
//
//		when(CustRepo.findAll()).thenReturn(cust);
//		List<Customer> expected = service.ViewAllCustomers();
//		assertEquals(expected, cust);
//		verify(CustRepo).findAll();
//		}
//	
//	@Test
//	void RemoveByIdTest() throws CustomerNotFoundException
//	{
//    Customer cust1 = new Customer(1,"Rohit","Roy","1234567890","Active");
//    when(CustRepo.findById(cust1.getCustomerId())).thenReturn(Optional.of(cust1));
//    service.removeCustomer(cust1.getCustomerId());
//    verify(CustRepo).deleteById(cust1.getCustomerId());
//	}
//	
//	@Test
//	void UpdateCustomerTest() throws CustomerNotFoundException
//	{
//		Customer cust = new Customer(1,"Rohit","Roy","1234567890","Active");
//		Customer newcust = new Customer(1,"Utkarsh","Parashar","1234567890","Active");
//		when(CustRepo.findById(cust.getCustomerId())).thenReturn(Optional.of(cust));
//		service.updateCustomerProfile(cust.getCustomerId(), newcust);
//		verify(CustRepo).save(newcust);
//		verify(CustRepo).findById(cust.getCustomerId());
//	}
//	
//	
//	
//	@Test
//	void contextLoads() {
//	}
//
//}