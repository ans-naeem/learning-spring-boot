package com.ans.spring.boot.todoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private todoService todoservice;

    @RequestMapping("/tasks")
    public List<TodoTask> getalltasks()
    {
        return todoservice.getalltasks();
    }

    @RequestMapping("/Task/{id}")
    public TodoTask gettask(@PathVariable Integer id){
        return todoservice.gettask(id);
    }


    //to enter the todo Task in to the data.
    @RequestMapping(method = RequestMethod.POST,value = "/todo")
    public String createtodo(@RequestBody TodoTask td)
    {
        if(todoservice.setTask(td)){
            return "Record entered successfully";
        }else{
            return "Task cant be added";
        }
    }
//
//    //we are going to implement an endpoint to update our Task.
//    @RequestMapping(method = RequestMethod.PUT,value = "/updatetask")
//    public String updateTask(@RequestBody TodoTask td)
//    {
//        if(todoservice.updateTask(td))
//        {
//            return "Task updated";
//        }
//        else{
//            return "Task cant be updated as there is no such Task of such id:"+td.getId();
//        }
//
//    }
//
//    //we are implementing to delete our Task.
//    @RequestMapping(method = RequestMethod.DELETE,value = "/delete/{id}")
//    public String deleteTask(@PathVariable Integer id)
//    {
//        todoservice.deleteTask(id);
//        return "deleted";
//    }
}
