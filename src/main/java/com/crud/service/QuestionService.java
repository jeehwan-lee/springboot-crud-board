package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Question;
import com.crud.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	public List<Question> getList() {
		return questionRepository.findAll();
	}
	
	public Question getQuestion(Integer id) {
		Optional<Question> question = questionRepository.findById(id);
		// question 없을 경우 예외처리 필요
		
		return question.get();
	}
}
