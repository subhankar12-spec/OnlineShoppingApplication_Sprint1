package com.cg.onlineshopping.service;
//package com.learnersstop.service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.learnersstop.entity.Department;
//import com.learnersstop.repository.DepartmentRepository;
//
//@SpringBootTest
//class DepartmentServiceTest {
//	
//	@Autowired
//	private DepartmentService departmentService;
//	
//	@MockBean
//	private DepartmentRepository departmentRepository;
//	
//	
//
//	@BeforeEach
//	void setUp() throws Exception {
//		
//		Department department = Department.builder().departmentId(1L).departmentName("IT").departmentCode("IT-01").departmentAddress("HYD").build();
//		
//		Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);
//		
//		
//	}
//
//	@Test
//	@DisplayName("testing the department by name")
//	void fetchDepartmentByNameTest() {
//		
//		String deptname = "IT";
//		
//		Department found = departmentService.fetchDepartmentByName(deptname);
//		
//		assertEquals(deptname, found.getDepartmentName());
//		
//		
//	}
//
//}