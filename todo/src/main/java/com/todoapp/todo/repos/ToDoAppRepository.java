package com.todoapp.todo.repos;

import com.todoapp.todo.model.ToDoApp;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ToDoAppRepository extends JpaRepository<ToDoApp, Long> {
}
