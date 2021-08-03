//package com.cg.onlineshopping.controllers;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cg.onlineshopping.entities.Department;
//import com.cg.onlineshopping.services.DepartmentService;
//
//
//
//@RestController
//public class DepartmentController {
//	
//	
//    private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);	
//    
//	@Autowired
//	private DepartmentService departmentService;
//	
//	@PostMapping("/department")
//	public Department saveDepartment(@Valid @RequestBody Department department)
//	{
//		logger.info("inside saveDepartment() of DepartmentController");
//		return departmentService.saveDepartment(department);
//	}
//	
//	
//	
//	
//	@GetMapping("/department")
//	public List<Department> fetchAllDepartments()
//	{
//		logger.info("inside fetchAllDepartments() of DepartmentController");
//		return departmentService.fetchAllDepartments();
//	}
//	
//	@GetMapping("/department/{id}")
//	public Department fetchById(@PathVariable("id") Long departmentId)
//	{
//		return departmentService.fetchById(departmentId);
//		
//	}
//	
//	@DeleteMapping("/department/{id}")
//    public String deleteById(@PathVariable("id") Long departmentId)
//    {
//		departmentService.deleteById(departmentId);
//    	return  "department - "  + departmentId + " deleted successfully";
//    }
//	
//	
//	@PutMapping("/department/{id}")
//	public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department)
//	{
//		return departmentService.updateDepartment(departmentId,department);
//	}
//
//	@GetMapping("/department/name/{name}")
//	public Department fetchById(@PathVariable("name") String departmentName)
//	{
//		return departmentService.fetchByDepartmentName(departmentName);
//		
//	}
//}
