package com.ans.spring.boot.todoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //to enter the todo task in to the data.
    @RequestMapping(method = RequestMethod.POST,value = "/todo")
    public String createtodo(@RequestBody task td)
    {
        if(todoservice.setTask(td)){
            return "Record entered successfully";
        }else{
            return "task cant be added";
        }
    }
}
