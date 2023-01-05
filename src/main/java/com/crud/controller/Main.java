package com.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {

	@ResponseBody
	@GetMapping("/")
	public String index() {
		return "hello";
	}
}
