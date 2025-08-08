package com.quiz.microservice.service;

import java.util.List;

import com.quiz.microservice.entity.Quiz;

public interface QuizService {
	Quiz add(Quiz q);
	
	List<Quiz> getAll();
	
	Quiz getById(Long id);
}
