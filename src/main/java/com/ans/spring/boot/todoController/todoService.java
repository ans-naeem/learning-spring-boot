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
        return tasks.stream().filter(T ->T.id.equals(id)).findFirst().get();
    }
}
