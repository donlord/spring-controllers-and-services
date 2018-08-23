package com.cooksys.springcontrollersandservices.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.springcontrollersandservices.entity.Answer;
import com.cooksys.springcontrollersandservices.entity.Question;
import com.cooksys.springcontrollersandservices.entity.Quiz;
import com.cooksys.springcontrollersandservices.services.AnswerService;
import com.cooksys.springcontrollersandservices.services.QuestionService;
import com.cooksys.springcontrollersandservices.services.QuizService;

@RestController
@RequestMapping(value = "quizes")
public class QuizController {

	private QuestionService qService;
	private AnswerService aService;
	private QuizService quizService;

	public QuizController(QuizService quizService, QuestionService qService, AnswerService aService) {
		this.quizService = quizService;
		this.aService = aService;
		this.qService = qService;
	}

	@GetMapping
	public List<Quiz> getAll() {
		return this.quizService.getAll();
	}

	@DeleteMapping("/{id}")
	public Quiz removeQuestion(@PathVariable(name = "id") Integer id) {
		return this.quizService.deleteQuestion(id - 1);
	}

	@PostMapping
	public Integer createQuiz(@RequestBody Quiz q) {
		return this.quizService.createQuiz(q);
	}

	@GetMapping("/{id}/random")
	public Quiz getRandom(@PathVariable(name = "id") Integer id) {
		int randInt = this.quizService.getRandom();
		return this.quizService.getSpecific(randInt - 1);
	}

	@PatchMapping("/{id}/rename/{newname}")
	public Quiz updateName(@PathVariable(name = "id") Integer id, @PathVariable(name = "newname") String name) {
		return this.quizService.updateQuiz(id, name);
	}

	@PatchMapping("{id}/add")
	public Question updateQuestion(@PathVariable(name = "id") Integer id, @RequestBody Question q) {
		return this.quizService.addQuestion(id, q);
	}
}
