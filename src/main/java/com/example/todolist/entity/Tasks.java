package com.example.todolist.entity;

import java.time.LocalDate;

public class Tasks {
    private int taskId;
    private String name;
    private String description;
    private int priority;
    private int markDone;    //1- сделано, 0 - нет
    private LocalDate taskCreated;
    private LocalDate taskChange;

}
