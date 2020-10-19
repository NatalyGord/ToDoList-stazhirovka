package com.example.todolist.entity;


import java.time.LocalDate;

/**
 * Класс Списки дел
 */
public class Lists {
    private int listId;
    private String name;
    private LocalDate listCreated;
    private LocalDate listChange;

    public Lists(String name) {
        this.name = name;
        this.listCreated = LocalDate.now();
    }

    public int getListId() {
        return this.listId;
    }

//    public void setListId(int listId) {
//        this.listId = listId;
//    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getListCreated() {
        return this.listCreated;
    }

//    public void setListCreated(LocalDate listCreated) {
//        this.listCreated = listCreated;
//    }

    public LocalDate getListChange() {
        return this.listChange;
    }

//    public void setListChange(LocalDate listChange) {
//        this.listChange = listChange;
//    }
}
