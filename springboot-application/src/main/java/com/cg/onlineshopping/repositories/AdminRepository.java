//package com.cg.onlineshopping.repositories;
//
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.cg.onlineshopping.entities.Admin;
//
//@Repository
//public interface AdminRepository extends JpaRepository<Admin, Integer>{
//	Admin findByAdminUsername(String adminUsername);	
//	Optional<Admin> findByAdminUsernameAndAdminpassword(String adminUsername, String adminpassword);	
//
//}