package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.model.Question;
import com.crud.service.AnswerService;
import com.crud.service.QuestionService;

@Controller
public class AnswerController {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private AnswerService answerService;

	@PostMapping("/answer/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam String content) {
		
		Question question = questionService.getQuestion(id);
		answerService.create(question, content);
		
		return String.format("redirect:/question/detail/%s", id);
	}
}
