package com.cg.onlineshopping.repository;
//package com.learnersstop.ServiceTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import com.learnersstop.entity.Department;
//import com.learnersstop.repository.DepartmentRepository;
//
//@DataJpaTest
//public class DepartmentRepoTest {
//	@Autowired
//	private DepartmentRepository deptRepo;
//	@Autowired
//	private TestEntityManager ent;
//	
//	@BeforeEach
//	void setup() throws Exception
//	{
////		Department dept=Department.builder().departmentCode("ECE-12").departmentName("Electronics").build();
////		ent.persist(dept);
//	}
//	
//	@Test
//	void findByIdTest ()
//	{
//		
//		String name="Electronics";
//		Department dp=deptRepo.findById(1L).get();
//		assertEquals(dp.getDepartmentName(), name);
//	}
//	
//	
//
//}
