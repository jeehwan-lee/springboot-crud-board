package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.crud.model.User;
import com.crud.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User create(String username, String email, String password) {
		User user = new User();
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(bCryptPasswordEncoder.encode(password));
		
		userRepository.save(user);
		return user;
	}	
}
