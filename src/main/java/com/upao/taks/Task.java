package com.upao.taks;

public class Task {
    private String name;

    // for deserialisation
    public Task(){}
    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}