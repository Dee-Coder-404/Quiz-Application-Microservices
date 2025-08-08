package com.question.microservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long qId;
	private String question;
	private Long quizId;
	
	
	
	public Question() {
		super();
	}



	public Question(Long qId, String question, Long quizId) {
		this.qId = qId;
		this.question = question;
		this.quizId = quizId;
	}



	public Long getqId() {
		return qId;
	}



	public void setqId(Long qId) {
		this.qId = qId;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public Long getQuizId() {
		return quizId;
	}

	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}

	@Override
	public String toString() {
		return "Question [qId=" + qId + ", question=" + question + ", quizId=" + quizId + "]";
	} 
	
	
	
	
}
