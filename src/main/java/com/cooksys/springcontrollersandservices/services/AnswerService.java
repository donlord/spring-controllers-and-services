package com.cooksys.springcontrollersandservices.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.springcontrollersandservices.entity.Answer;
import com.cooksys.springcontrollersandservices.entity.Question;

@Service
public class AnswerService {
	private List<Answer> answers;

	public AnswerService() {
		answers = new ArrayList<Answer>();
		Answer a = new Answer("Blue");
		answers.add(a);
	}

	public Answer get(Integer id) {
		return this.answers.get(id - 1);
	}

	public List<Answer> getAllA() {
		return this.answers;
	}
}
