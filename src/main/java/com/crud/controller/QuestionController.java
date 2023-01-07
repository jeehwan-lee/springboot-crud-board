package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Question;
import com.crud.repository.QuestionRepository;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionRepository questionRepository;

	@GetMapping("/question/list")
	public String list(Model model) {
		List<Question> questionList = questionRepository.findAll();
		model.addAttribute("questionList", questionList);
		return "question_list";
	}
}
