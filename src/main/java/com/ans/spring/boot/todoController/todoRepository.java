package com.ans.spring.boot.todoController;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todoRepository extends CrudRepository <task,Integer>{
}
