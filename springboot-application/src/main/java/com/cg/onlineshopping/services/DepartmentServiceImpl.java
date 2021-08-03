//package com.cg.onlineshopping.services;
//
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cg.onlineshopping.entities.Department;
//import com.cg.onlineshopping.exceptions.DepartmentNameNotFoundException;
//import com.cg.onlineshopping.exceptions.DepartmentNotFoundException;
//import com.cg.onlineshopping.repositories.DepartmentRepository;
//
//@Service
//public class DepartmentServiceImpl implements DepartmentService {
//
//	@Autowired
//	private DepartmentRepository departmentRepository;
//
//	@Override
//	public Department saveDepartment(Department department) {
//		// TODO Auto-generated method stub
//		return departmentRepository.save(department);
//	}
//
//	@Override
//	public List<Department> fetchAllDepartments() {
//		// TODO Auto-generated method stub
//		return departmentRepository.findAll();
//	}
//
//	@Override
//	public Department fetchById(Long departmentId) {
//		// TODO Auto-generated method stub
//		Optional<Department> department = departmentRepository.findById(departmentId);
//	    if(!department.isPresent())
//	    		{
//	    	throw new DepartmentNotFoundException("department is not available");
//	    		}
//	    
//	    return department.get();
//	
//	}
//
//	@Override
//	public void deleteById(Long departmentId) {
//		
//
//		departmentRepository.deleteById(departmentId);
//	}
//
//	@Override
//	public Department updateDepartment(Long departmentId, Department department) {
//		// TODO Auto-generated method stub
//
//		Department deptDb = departmentRepository.findById(departmentId).get();
//
//		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
//			deptDb.setDepartmentName(department.getDepartmentName());
//		}
//
//		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
//			deptDb.setDepartmentCode(department.getDepartmentCode());
//		}
//		if (Objects.nonNull(department.getDepartmentAddress())
//				&& !"".equalsIgnoreCase(department.getDepartmentAddress())) {
//			deptDb.setDepartmentAddress(department.getDepartmentAddress());
//		}
//
//		return departmentRepository.save(deptDb);
//	}
//
//	@Override
//	public Department fetchByDepartmentName(String departmentName) {
//		Department dept = departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
//	    if(dept==null)
//	    {
//	    	throw new DepartmentNameNotFoundException("Department Name is not available");
//	    }
//	    else
//	    {
//	    	return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
//	    }
//	}
//
//}

//⌚ (03:08:17) Exclude Actuator Endpoints
