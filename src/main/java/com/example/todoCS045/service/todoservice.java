package com.example.todoCS045.service;

import java.util.List;

import com.example.todoCS045.entity.todo;

public interface todoservice {
	List<todo> getAlltodos();
	
	todo saveTodo(todo todo_item);
	
	

}
