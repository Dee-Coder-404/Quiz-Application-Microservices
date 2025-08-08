package com.quiz.microservice.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	transient private List<Question> questiondup;
	public Quiz(long id, String title, List<Question> questiondup) {
		super();
		this.id = id;
		this.title = title;
		this.questiondup = questiondup;
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + ", questiondup=" + questiondup + "]";
	}
	public Quiz() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Question> getQuestiondup() {
		return questiondup;
	}
	public void setQuestiondup(List<Question> questiondup) {
		this.questiondup = questiondup;
	}

	
	
}
