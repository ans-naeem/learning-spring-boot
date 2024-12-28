package com.ans.spring.boot.todoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private todoService todoservice;

    @RequestMapping("/tasks")
    public List<task> getalltasks()
    {
        return todoservice.getalltasks();
    }

    @RequestMapping("/task/{id}")
    public task gettask(@PathVariable Integer id){
        return todoservice.gettask(id);

    }
}
