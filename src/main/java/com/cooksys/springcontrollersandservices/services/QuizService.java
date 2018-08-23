package com.cooksys.springcontrollersandservices.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.springcontrollersandservices.entity.Answer;
import com.cooksys.springcontrollersandservices.entity.Question;
import com.cooksys.springcontrollersandservices.entity.Quiz;

@Service
public class QuizService {
	private List<Question> questions;

	private List<Quiz> quizes;

	private QuestionService qService;
	private AnswerService aService;

	public QuizService(QuestionService qs, AnswerService as) {
		this.quizes = new ArrayList<Quiz>();
		questions = new ArrayList<Question>();
		Question q = new Question("What is my favorite color");
		questions.add(q);
		Answer a = new Answer("Blue");
		q.addAnswer(a);

		this.qService = qs;
		this.aService = as;

	}

	public List<Quiz> getAll() {
		return this.quizes;
	}

	public Quiz getSpecific(Integer id) {
		return this.quizes.get(id);
	}

	public Integer createQuiz(Quiz q) {
		Quiz newQuiz = new Quiz(q.getName());
		newQuiz.setQuestions(q.getQuestions());
		this.quizes.add(newQuiz);
		return newQuiz.getId();
	}

	public Quiz deleteQuestion(Integer q) {
		Quiz QuizToDelete = this.quizes.get(q);
		this.quizes.remove(QuizToDelete);
		return QuizToDelete;
	}

	public int getRandom() {
		int size = this.quizes.size();
		int rand = (int) ((Math.random() * ((size - 0) + 1)) + 0);
		return rand;
	}

	public Quiz updateQuiz(Integer id, String n) {
		Quiz updatedQuiz = this.quizes.get(id - 1);
		updatedQuiz.setName(n);
		return updatedQuiz;
	}

	public Question addQuestion(Integer id, Question q) {
		Question adding = this.questions.get(id - 1);
		adding.setName(q.getName());
		return adding;
	}
}
