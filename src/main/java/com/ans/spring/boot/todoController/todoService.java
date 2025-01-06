package com.ans.spring.boot.todoController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class todoService {

    @Autowired
    private ToDoRepository todoRepo;

    public List<Task> getalltasks()
    {
        List<Task> lists=new ArrayList<>();
        todoRepo.findAll().forEach(lists::add);

        return lists;
    }

    public Task gettask(Integer id)
    {
        return todoRepo.findById(id).get();
    }

    public boolean setTask(Task td) {
        try{
            todoRepo.save(td);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public boolean updateTask(Task td) {

        try{
            todoRepo.save(td);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteTask(Integer id) {
        try {
            todoRepo.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        for(int i=0;i<tasks.size();i++)
//        {
//            if(tasks.get(i).getId().equals(id))
//            {
//                tasks.remove(i);
//            }
//        }


    }
}
