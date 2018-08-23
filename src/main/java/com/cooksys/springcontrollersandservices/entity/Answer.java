package com.cooksys.springcontrollersandservices.entity;

import java.util.ArrayList;
import java.util.List;

public class Answer {
	private static int count = 1;
	private Integer id;
	private String name;
	
	public Answer () {}
	
	public Answer (String n) {
		this.id = count;
		this.name = n;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Answer.count = count;
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
	
	
}
