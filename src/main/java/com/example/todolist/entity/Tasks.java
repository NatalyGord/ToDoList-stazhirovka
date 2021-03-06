package com.example.todolist.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Класс дела
 */
@Entity
@Data
public class Tasks {

    @Id
    private UUID taskId;

    private String name;

    private String description;

    private int priority;    // от 1 до 5

    private int markDone;    //1- сделано, 0 - нет

    private LocalDate taskCreated;

    private LocalDate taskChange;

    private UUID listId;

    public Tasks(String name) {
        this.name = name;
        taskCreated = LocalDate.now();
        markDone = 0;
    }

    public Tasks(String name, String description) {
        this.name = name;
        this.description = description;
        taskCreated = LocalDate.now();
        markDone = 0;
    }

    public Tasks(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        taskCreated = LocalDate.now();
        markDone = 0;
    }

    public Tasks() {
    }

    @javax.persistence.Id
    public UUID getTaskId() {
        return this.taskId;
    }

    public void setTaskId(UUID taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getMarkDone() {
        return this.markDone;
    }

    public void setMarkDone(int markDone) {
        this.markDone = markDone;
    }

    public LocalDate getTaskCreated() {
        return this.taskCreated;
    }

    public void setTaskCreated(LocalDate taskCreated) {
        this.taskCreated = taskCreated;
    }

    public LocalDate getTaskChange() {
        return this.taskChange;
    }

    public void setTaskChange(LocalDate taskChange) {
        this.taskChange = taskChange;
    }
}
