package com.example.todolist.entity;

import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Класс Списки дел
 */
@Entity
@Data
public class Lists {

    @Id
    private UUID listId;

    private String name;

    private LocalDate listCreated;

    private LocalDate listChange;

    private String id;

    public Lists() {
    }

    public Lists(String name) {
        this.name = name;
        listCreated = LocalDate.now();
    }

    @javax.persistence.Id
    public UUID getListId() {
        return listId;
    }

    public void setListId(UUID listId) {
        this.listId = listId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getListCreated() {
        return this.listCreated;
    }

    public void setListCreated(LocalDate listCreated) {
        this.listCreated = listCreated;
    }

    public LocalDate getListChange() {
        return this.listChange;
    }

    public void setListChange(LocalDate listChange) {
        this.listChange = listChange;
    }
}
