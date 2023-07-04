package com.geekster.ToDo.app.Service;


import com.geekster.ToDo.app.Repository.TodoRepo;
import com.geekster.ToDo.app.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepo todoRepo;
    public List<Todo> getAllTodos(){
        return todoRepo.getMyTodos();
    }


    public List<Todo> getDoneTodos( ){
        List<Todo> doneTodos = new ArrayList<>();
        for( Todo getTodo : todoRepo.getMyTodos()){
            if(getTodo.isTodoDoneStatus() ){
                doneTodos.add(getTodo);
            }
        }
        return doneTodos;
    }

    public List<Todo> getUndoneTodos() {
        List<Todo> undoneTodos = new ArrayList<>();
        for (Todo getTodos : todoRepo.getMyTodos()) {
            if (!getTodos.isTodoDoneStatus()) {
                undoneTodos.add(getTodos);
            }
        }
        return undoneTodos;
    }

    public void createTodos( Todo todo){
        todoRepo.getMyTodos().add(todo);
    }

    public String putTodos( Integer todoId, boolean status){
        for(Todo getTodos : todoRepo.getMyTodos()){
            if(getTodos.getTodoId().equals(todoId)){
                getTodos.setTodoDoneStatus(status);
                return "Status for todoId: "+todoId+" has been changed to "+status;
            }
        }
        return "todo not found with todoId: "+todoId;
    }

    public String deleteTodo(Integer todoId){
        for(Todo getTodo : todoRepo.getMyTodos()){
            if((int)getTodo.getTodoId() == (int)todoId){
                todoRepo.getMyTodos().remove(getTodo);
                return "Todo with TodoId: " +todoId+" has been removed";
            }
        }
        return "Todo with Todo Id: "+todoId+ " not found";
    }
}
