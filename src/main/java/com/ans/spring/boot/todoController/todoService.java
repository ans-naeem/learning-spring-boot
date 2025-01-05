package com.ans.spring.boot.todoController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class todoService {

    private static final Logger log = LoggerFactory.getLogger(todoService.class);
    @Autowired
    private todoRepository todoRepo;

    public List<task> getalltasks()
    {
        List<task> lists=new ArrayList<>();
        todoRepo.findAll().forEach(lists::add);

        return lists;
    }

    public task gettask(Integer id)
    {
        return todoRepo.findById(id).get();
    }

    public boolean setTask(task td) {
        try{
            todoRepo.save(td);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public boolean updateTask(task td) {

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
