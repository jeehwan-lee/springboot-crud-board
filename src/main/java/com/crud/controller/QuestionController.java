package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.AnswerForm;
import com.crud.model.Question;
import com.crud.model.QuestionForm;
import com.crud.repository.QuestionRepository;
import com.crud.service.QuestionService;

import jakarta.validation.Valid;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;

	/*
	@GetMapping("/question/list")
	public String list(Model model) {
		List<Question> questionList = questionService.getList();
		model.addAttribute("questionList", questionList);
		return "question_list";
	}*/
	
	@GetMapping("/question/list")
	public String list(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
		
		Page<Question> paging = questionService.getList(page);
		model.addAttribute("paging", paging);
		return "question_list";
	}
	
	@GetMapping("/question/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id, AnswerForm answerForm) {
		Question question = questionService.getQuestion(id);
		model.addAttribute("question", question);
		
		return "question_detail";
	}
	
	@GetMapping("/question/create")
	public String questionCreate(QuestionForm questionForm) {
		return "question_form";
	}
	
	/*
	@PostMapping("question/create")
	public String questionCreate(@RequestParam String subject, @RequestParam String content) {
		questionService.create(subject, content);
		return "redirect:/question/list";
	} */
	
	@PostMapping("question/create")
	public String questionCreate(@Valid QuestionForm questionForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "question_form";
		}
		questionService.create(questionForm.getSubject(), questionForm.getContent());
		return "redirect:/question/list";
	}
}
