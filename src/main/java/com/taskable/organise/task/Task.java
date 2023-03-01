package com.taskable.organise.task;

import com.taskable.organise.user.User;

import java.util.Date;

public class Task {
    private String id;
    private String name;
    private Date created_at;
    private Date updated_at;

    private User createdBy;

    private User assignedTo;

    private  Date timeToComplete;


    public Task(String name, Date created_at, Date updated_at, User createdBy, User assignedTo, Date timeToComplete) {
        this.name = name;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.createdBy = createdBy;
        this.assignedTo = assignedTo;
        this.timeToComplete = timeToComplete;
    }
}


