package com.example.TodoList.service;


import java.util.ArrayList;
import com.example.TodoList.model.Todo;

public class todoService {
    private int idTrace = 0;
    private ArrayList<Todo> todos = new ArrayList<Todo>();

    public Todo addTask(Todo todo) {
        todo.setId(++idTrace);
        todo.setCompleted(false);
        todos.add(todo);
        return todo;
    }

    public ArrayList<Todo> getAllTasks() {
        return todos;
    }

    public Todo getTask(int id) {
        Todo filteredTodo = new Todo(0, null, null, null);

        for (Todo todo : todos) {
            if (todo.getId() == id) {
                filteredTodo = todo;
                break;
            }
        }

        return filteredTodo;
    }

    public Todo updateTask(int id, Todo todo) {
        Todo updatedTodo = new Todo();

        for (int index = 0; index < todos.size(); index++) {
            if (todos.get(index).getId() == id) {
                todo.setId(id);
                todos.set(index, todo);
                updatedTodo = todo;
            }
        }

        return updatedTodo;
    }

    public boolean removeTask(int id) {
        for (int index = 0; index < todos.size(); index++) {
            if (todos.get(index).getId() == id) {
                todos.remove(index);
                return true;
            }
        }

        return false;
    }
}