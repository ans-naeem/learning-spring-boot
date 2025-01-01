package com.ans.spring.boot.todoController;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class todoService {

    private List<task> tasks=new ArrayList<>(
            Arrays.asList(new task(1,"name1","desc1","summa1"),
                    new task(2,"name2","desc2","summa2"),
                    new task(3,"name3","desc3","summa3"),
                    new task(4,"name4","desc4","summa4"))
    );

    public List<task> getalltasks()
    {
        return tasks;
    }

    public task gettask(Integer id)
    {
        return tasks.stream().filter(T ->T.id.equals(id)).findFirst().orElse(null);
    }

    public boolean setTask(task td) {
        try {
            tasks.add(td);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);

        }

    }

    public boolean updateTask(task td) {
        for(int i=0;i<tasks.size();i++)
        {
            if(tasks.get(i).getId().equals(td.getId()))
            {
                tasks.set(i,td);
                return true;
            }
        }
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

        if(tasks.removeIf(t->t.getId().equals(id)))
        {
            return true;
        }
        return false;
    }
}
