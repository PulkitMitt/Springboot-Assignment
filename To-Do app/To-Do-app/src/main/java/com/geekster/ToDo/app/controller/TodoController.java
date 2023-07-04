package com.geekster.ToDo.app.controller;

import com.geekster.ToDo.app.entity.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TodoController {
    private List<Todo> myTodos;

    public TodoController() {
        myTodos = new ArrayList<>();
    }

    @GetMapping("all/todos")
    public List<Todo> getAllTodos(){
        return myTodos;
    }

    @GetMapping("todo/done")
    public List<Todo> getDoneTodos( ){
        List<Todo> doneTodos = new ArrayList<>();
        for( Todo getTodo : myTodos){
            if(getTodo.isTodoDoneStatus() ){
                doneTodos.add(getTodo);
            }
        }
        return doneTodos;
    }

    @GetMapping("todo/undone")
    public List<Todo> getUndoneTodos(){
        List<Todo> undoneTodos = new ArrayList<>();
        for(Todo getTodos : myTodos){
            if(!getTodos.isTodoDoneStatus()){
                undoneTodos.add(getTodos);
            }
        }
        return undoneTodos;
    }

    @PostMapping("create/Todos")
    public String createTodos(@RequestBody Todo todo){
        myTodos.add(todo);
        return "Todo has been added!";
    }

    @PutMapping("put/todo/{todoId}/{status}")
    public String putTodos(@PathVariable Integer todoId, @PathVariable boolean status){
        for(Todo getTodos : myTodos){
            if(getTodos.getTodoId().equals(todoId)){
                getTodos.setTodoDoneStatus(status);
                return "Status for todoId: "+todoId+" has been changed to "+status;
            }
        }
        return "todo not found with todoId: "+todoId;
    }

    @DeleteMapping("delete/todo/{todoId}")
    public String deleteTodo(@PathVariable Integer todoId){
        for(Todo getTodo : myTodos){
            if((int)getTodo.getTodoId() == (int)todoId){
                myTodos.remove(getTodo);
                return "Todo with TodoId: " +todoId+" has been removed";
            }
        }
        return "Todo with Todo Id: "+todoId+ " not found";
    }

}
