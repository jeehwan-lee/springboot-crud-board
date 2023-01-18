package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.model.AnswerForm;
import com.crud.model.Question;
import com.crud.service.AnswerService;
import com.crud.service.QuestionService;

import jakarta.validation.Valid;

@Controller
public class AnswerController {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private AnswerService answerService;

	/*
	@PostMapping("/answer/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam String content) {
		
		Question question = questionService.getQuestion(id);
		answerService.create(question, content);
		
		return String.format("redirect:/question/detail/%s", id);
	} */
	
	@PostMapping("/answer/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id, @Valid AnswerForm answerForm, BindingResult bindingResult) {
		
		Question question = questionService.getQuestion(id);
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("question", question);
			return "question_detail";
		}
		
		answerService.create(question, answerForm.getContent());
		
		return String.format("redirect:/question/detail/%s", id);
	}
}
