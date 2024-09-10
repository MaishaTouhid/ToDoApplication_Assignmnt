
package com.example.TodoList.controller;

import com.example.TodoList.model.Todo;
import com.example.TodoList.service.todoService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TodoController {

    private com.example.TodoList.service.todoService todoService;

    public TodoController() {
        this.todoService = new todoService();
    }

    // Rendering the home template (home.html)
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping("/todos")
    public List<Todo> viewTask() {
        return todoService.getAllTasks();
    }

    @GetMapping("/todos/{id}")
    public Todo viewOneTask(@PathVariable int id) {
        return todoService.getTask(id);
    }

    @PostMapping("/todos")
    public Todo addTask(@RequestBody Todo todo) {
        return todoService.addTask(todo);
    }

    @PutMapping("/todos/{id}")
    public Todo updateTask(@PathVariable int id, @RequestBody Todo todo) {
        return todoService.updateTask(id, todo);
    }

    @DeleteMapping("/todos/{id}")
    public boolean removeTask(@PathVariable int id) {
        return todoService.removeTask(id);
    }
}