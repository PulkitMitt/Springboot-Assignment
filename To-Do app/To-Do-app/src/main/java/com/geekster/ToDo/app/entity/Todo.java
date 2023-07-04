package com.geekster.ToDo.app.entity;

public class Todo {
    private Integer todoId = 0;

    static Integer count = 0;
    private String todoName;
    private boolean isTodoDoneStatus;

    public Integer getTodoId() {
        return todoId;
    }

    public Todo() {
         count++;
         this.todoId = count;
    }

//    public void setTodoId(Integer todoId) {
//        this.todoId = todoId;
//    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public boolean isTodoDoneStatus() {
        return isTodoDoneStatus;
    }

    public void setTodoDoneStatus(boolean todoDoneStatus) {
        isTodoDoneStatus = todoDoneStatus;
    }
}
