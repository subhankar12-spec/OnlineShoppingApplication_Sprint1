package com.cg.onlineshopping.services;


import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineshopping.entities.User;
import com.cg.onlineshopping.exceptions.user.UserNotFoundException;
import com.cg.onlineshopping.repositories.IUserRepository;



@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository repo;

	
	public List<User> ViewAllUsers()
	{
		return repo.findAll();
	}

	@Override
	public User addUser(User user) {
		return repo.save(user);
	}

	@Override
	public User updateUserProfile(int id,User bean) throws UserNotFoundException {
		
		User user=repo.findById(id).get();
		if(user==null)
		{
			throw new UserNotFoundException("User Not Present");
		}
		else {
			user.setUserPassword(bean.getUserPassword());
			user.setRole(bean.getRole());	
		}
		return null;
	}
	
	@Override
	public User ViewUser(int userId) throws UserNotFoundException{
		User user = repo.findById(userId).orElse(null);
		if (Objects.isNull(user))
			throw new UserNotFoundException("No user present with user Id" + userId);
		return user;
	}
	
	@Override
	public boolean loginDetails(int userID, String userPassword) {
		User user = repo.findByUserIDAndUserPassword(userID, userPassword);
		if (Objects.nonNull(user))
			return true;
		else
			return false;
	}


	@Override
	public void validateUser(User user) throws UserNotFoundException{
//		String s = String.valueOf(user.getUserPhone());
//		Pattern p = Pattern.compile("^[1-9]{1}[0-9]{9}$");
//		Matcher match = p.matcher(s);
//		if (s.length() != 10 && !match.matches()) {
//			throw new UserNotFoundException("The Phone Number is invalid.");
//		}

		String email = user.getEmail();
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9+]+@[a-zA-Z0-9.-]+$");
		Matcher m = pattern.matcher(email);
		if (!m.matches()) {
			throw new UserNotFoundException("The Email Address is invalid.");
		}
	}

}