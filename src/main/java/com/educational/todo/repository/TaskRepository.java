package com.educational.todo.repository;

import com.educational.todo.Model.Task;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.Table;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
