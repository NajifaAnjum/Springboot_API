package com.example.demo.topic;



public class Topic {
    private String id;          //member variables or fields
    private String name;
    private String description;

    //constructor no-args
    public Topic() {
    }

    //constructor with parameter
    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //getter and setter for all variables
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}