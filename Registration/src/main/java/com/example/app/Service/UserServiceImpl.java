package com.example.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.Entity.User;
import com.example.app.Repository.UserRepo;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;
	@Override
	public void registerUser(User user) {
		repo.save(user);
		
	}

	}
	
	


