package com.ans.spring.boot.todoController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class todoService {

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
        return true;

    }

    public boolean updateTask(task td) {

        return false;

    }

    public boolean deleteTask(Integer id) {
//        for(int i=0;i<tasks.size();i++)
//        {
//            if(tasks.get(i).getId().equals(id))
//            {
//                tasks.remove(i);
//            }
//        }


        return false;
    }
}
