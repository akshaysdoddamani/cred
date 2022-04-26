package com.example.todoCS045.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todoCS045.entity.todo;

public interface todorepository extends JpaRepository<todo, Long> {

}
