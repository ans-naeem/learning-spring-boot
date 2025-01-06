package com.ans.spring.boot.todoController;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository <Task,Integer>{
}
