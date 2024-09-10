package com.example.TodoList.model;

public class Todo {
    private int id;
    private String description;
    private String due;
    private Boolean completed;

    // Default constructor
    public Todo() {
    }

    // Parameterized constructor
    public Todo(int id, String description, String due, Boolean completed) {
        this.id = id;
        this.description = description;
        this.due = due;
        this.completed = completed;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
