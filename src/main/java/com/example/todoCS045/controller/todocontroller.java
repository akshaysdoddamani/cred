package com.example.todoCS045.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.todoCS045.entity.todo;
import com.example.todoCS045.service.todoservice;

@Controller
public class todocontroller {
	private todoservice todo_service;

	public todocontroller(todoservice todo_service) {
		super();
		this.todo_service = todo_service;
	}

	// handler method to handle  and return mode and view
	@GetMapping("/todos")
	public String listtodos(Model model) {
		model.addAttribute("todos", todo_service.getAlltodos());
		return "todos";
	}
	@GetMapping("/todos/new")
	public String Createtodo(Model model) {
		todo todo_obj=new todo();
		model.addAttribute("todo",todo_obj);
		return "create_todo";
		
	}
	@PostMapping("/todos")
	public String savetodo(@ModelAttribute("todo") todo todo_item) {
		todo_service.saveTodo(todo_item);
		return "redirect:/todos";
	}

}
