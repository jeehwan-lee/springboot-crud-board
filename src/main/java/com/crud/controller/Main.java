package com.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {

	@GetMapping("/")
	public String index() {
		return "redirect:/question/list";
	}
}
