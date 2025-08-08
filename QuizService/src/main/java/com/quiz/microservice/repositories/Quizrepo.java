package com.quiz.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.microservice.entity.Quiz;

@Repository
public interface Quizrepo extends JpaRepository<Quiz, Long> {
		 
}
