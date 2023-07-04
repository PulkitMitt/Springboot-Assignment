package com.geekster.ToDo.app.Repository;

import com.geekster.ToDo.app.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepo {

    @Autowired
    private List<Todo> myTodos;

    public List<Todo> getMyTodos(){
        return myTodos;
    }

}
