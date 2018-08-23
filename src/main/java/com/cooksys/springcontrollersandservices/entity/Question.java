package com.cooksys.springcontrollersandservices.entity;

import java.util.ArrayList;
import java.util.List;

public class Question {
	private static int count = 1;
	private Integer id;
	private String name;
	private List<Answer> answers = new ArrayList<Answer>();

	public Question() {
	}

	public Question(String n) {
		List<Answer> list = new ArrayList<Answer>();
		this.id = count;
		this.name = n;
		count++;
	}

	public Question(Integer id, String n) {
		this.id = id;
		this.name = n;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Question.count = count;
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

	public void setName(String question) {
		this.name = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public void addAnswer(Answer a) {
		this.answers.add(a);
	}

}
