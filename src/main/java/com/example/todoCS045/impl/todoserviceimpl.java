package com.example.todoCS045.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todoCS045.entity.todo;
import com.example.todoCS045.repository.todorepository;
import com.example.todoCS045.service.todoservice;
@Service
public class todoserviceimpl implements todoservice  {
	private todorepository todo_repository;

	public todoserviceimpl(todorepository todo_repository) {
		super();
		this.todo_repository = todo_repository;
	}

	@Override
	public List<todo> getAlltodos() {
		// TODO Auto-generated method stub
		return todo_repository.findAll();
	}

	@Override
	public todo saveTodo(todo todo_item) {
		// TODO Auto-generated method stub
		return todo_repository.save(todo_item);
	}

	
}
