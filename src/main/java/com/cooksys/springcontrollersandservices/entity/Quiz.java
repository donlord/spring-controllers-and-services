package com.cooksys.springcontrollersandservices.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

public class Quiz {
	private static int count = 1;
	private Integer id;
	private String name;

	private List<Question> questions = new ArrayList<Question>();

	public Quiz() {
	}

	public Quiz(String name) {
		this.id = count;
		this.name = name + " " + id;
		count++;

	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Quiz.count = count;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public void addQuestions(Question q) {
		this.questions.add(q);
	}

	public void removeQuestions(Question q) {
		this.questions.remove(q);
	}

}
