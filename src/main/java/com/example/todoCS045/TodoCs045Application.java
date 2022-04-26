package com.example.todoCS045;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.todoCS045.entity.todo;
import com.example.todoCS045.repository.todorepository;

@SpringBootApplication
public class TodoCs045Application  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TodoCs045Application.class, args);
	}
	@Autowired
	private todorepository todo_repository;

	@Override
	public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	//todo todo1=new todo("hi");
	//todo_repository.save(todo1);
	
	//todo todo2=new todo("bye");
	//todo_repository.save(todo2);
		
	}

}
