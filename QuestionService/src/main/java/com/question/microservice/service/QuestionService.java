package com.question.microservice.service;

import java.util.List;

import com.question.microservice.entity.Question;

public interface QuestionService {
	
	Question create(Question question);
	
	List<Question> getAll();
	
	Question getById(Long id);
	
	List<Question> getByQuizId(Long quizId);
}
