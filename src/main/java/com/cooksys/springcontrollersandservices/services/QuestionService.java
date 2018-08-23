package com.cooksys.springcontrollersandservices.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.springcontrollersandservices.entity.Answer;
import com.cooksys.springcontrollersandservices.entity.Question;

@Service
public class QuestionService {

	private List<Question> questions;
	private List<Answer> answers;

	public QuestionService() {
		questions = new ArrayList<Question>();
		Question q = new Question("What is my favorite color");
		questions.add(q);
		answers = new ArrayList<Answer>();
		Answer a = new Answer("blue");
		Answer b = new Answer("aaablue");
		q.addAnswer(a);
		q.addAnswer(b);
	}

	public Question get(Integer id) {
		return this.questions.get(id - 1);
	}

	public List<Answer> gettAllA() {
		return this.answers;
	}

}
