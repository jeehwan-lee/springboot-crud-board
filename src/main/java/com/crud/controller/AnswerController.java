package com.crud.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.model.AnswerForm;
import com.crud.model.Question;
import com.crud.model.User;
import com.crud.service.AnswerService;
import com.crud.service.QuestionService;
import com.crud.service.UserService;

import jakarta.validation.Valid;

@Controller
public class AnswerController {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private AnswerService answerService;
	
	@Autowired
	private UserService userService;

	/*
	@PostMapping("/answer/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam String content) {
		
		Question question = questionService.getQuestion(id);
		answerService.create(question, content);
		
		return String.format("redirect:/question/detail/%s", id);
	} */
	
	@PreAuthorize("isAuthenticated()")
	@PostMapping("/answer/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id, @Valid AnswerForm answerForm, BindingResult bindingResult, Principal principal) {
		
		Question question = questionService.getQuestion(id);
		User user = userService.getUser(principal.getName());
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("question", question);
			return "question_detail";
		}
		
		answerService.create(question, answerForm.getContent(), user);
		
		return String.format("redirect:/question/detail/%s", id);
	}
}
