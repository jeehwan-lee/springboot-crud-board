package com.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.crud.model.User;
import com.crud.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User create(String username, String email, String password) {
		User user = new User();
		
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(passwordEncoder.encode(password));
		
		userRepository.save(user);
		return user;
	}	
	
	public User getUser(String username) {
		Optional<User> user = userRepository.findByusername(username);
		// user를 못찾을 경우 예외처리 필요
		return user.get();
	}
}
