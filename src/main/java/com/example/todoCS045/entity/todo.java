package com.example.todoCS045.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todos")
public class todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "todo_item", nullable = false)
	private String todoitem;
	public todo(){
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTodoitem() {
		return todoitem;
	}
	public void setTodoitem(String todoitem) {
		this.todoitem = todoitem;
	}
	public todo(String todoitem) {
		super();
		this.todoitem = todoitem;
	}

}
