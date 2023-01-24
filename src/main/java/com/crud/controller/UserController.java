package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.model.UserForm;
import com.crud.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/signup")
	public String signup(UserForm userForm) {
		return "signup_form";
	}
	
	@PostMapping("/user/signup")
	public String signup(@Valid UserForm userForm, BindingResult bingBindingResult) {
		
		if(bingBindingResult.hasErrors()) {
			return "signup_form";
		}
		
		if(!userForm.getPassword().equals(userForm.getPasswordAgain())) {
			bingBindingResult.rejectValue("passwordAgain", "passwordInCorrect", "비밀번호가 일치하지 않습니다.");
			return "signup_form";
		}
		
		try {
			userService.create(userForm.getUsername(), userForm.getEmail(), userForm.getPassword());
		} catch (DataIntegrityViolationException e) {
			// TODO: handle exception
			bingBindingResult.reject("signupFailed", "이미 등록된 아이디입니다.");
			return "signup_form";
		} catch(Exception e) {
			bingBindingResult.reject("signupFailed", e.getMessage());
			return "signup_form";
		}
		
		return "redirect:/";
	}
}
