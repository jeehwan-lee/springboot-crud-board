package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Question;
import com.crud.repository.QuestionRepository;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionRepository questionRepository;

	@GetMapping("/question/list")
	public String list() {
		List<Question> questionList = questionRepository.findAll();
		for(Question question : questionList) {
			System.out.println("제목 : " + question.getSubject());
			System.out.println("내용 : " + question.getContent());
		}
		return "test";
	}
}
