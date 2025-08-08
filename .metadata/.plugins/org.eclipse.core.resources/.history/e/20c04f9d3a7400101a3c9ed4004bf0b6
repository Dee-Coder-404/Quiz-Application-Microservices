package com.quiz.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.microservice.entity.Quiz;
import com.quiz.microservice.service.QuizService;

@RestController
@RequestMapping("/quizmicro")
public class QuizController {
	
	@Autowired
	private QuizService service;
	
	@PostMapping("/create")
	public Quiz create(@RequestBody Quiz quiz ) {
		return service.add(quiz);
	}
	 
	@GetMapping("/getall")
	public List<Quiz> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Quiz getById(@PathVariable Long id) {
		return service.getById(id);	
	}
	
}
