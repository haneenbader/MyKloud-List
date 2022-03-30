package com.example.mykloudlist.Model;

public class Task {
    private int priority ;
    private String name ;

    public Task( int priority, String name) {
        this.priority = priority;
        this.name = name;
    }


    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


