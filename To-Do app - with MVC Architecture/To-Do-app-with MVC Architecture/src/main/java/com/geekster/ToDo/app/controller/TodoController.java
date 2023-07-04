package com.geekster.ToDo.app.controller;

import com.geekster.ToDo.app.Service.TodoService;
import com.geekster.ToDo.app.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("all/todos")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping("todo/done")
    public List<Todo> getDoneTodos( ){
        return todoService.getDoneTodos();
    }

    @GetMapping("todo/undone")
    public List<Todo> getUndoneTodos(){
        return todoService.getUndoneTodos();
    }

    @PostMapping("create/Todos")
    public String createTodos(@RequestBody Todo todo){
        todoService.createTodos(todo);
        return "Todo has been added!";
    }

    @PutMapping("put/todo/{todoId}/{status}")
    public String putTodos(@PathVariable Integer todoId, @PathVariable boolean status){
        return todoService.putTodos(todoId, status);
    }

    @DeleteMapping("delete/todo/{todoId}")
    public String deleteTodo(@PathVariable Integer todoId){
        return todoService.deleteTodo(todoId);
    }

}
