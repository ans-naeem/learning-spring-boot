package com.ans.spring.boot.Repositories;

import com.ans.spring.boot.todoController.TodoTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository <TodoTask,Integer>{
}
