package com.cg.onlineshopping.services;

import java.util.List;

import com.cg.onlineshopping.entities.User;
import com.cg.onlineshopping.exceptions.user.UserNotFoundException;


public interface IUserService {
	
//public boolean validateUser(String username,String password);
	
	public User addUser(User user);
	public List<User> ViewAllUsers();
	public User updateUserProfile(int id,User bean) throws UserNotFoundException;
//	public boolean signIn();
//	public boolean signOut();
//	
	
	// all CURD Operations on User

}