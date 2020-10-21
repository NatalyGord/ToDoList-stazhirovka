package com.example.todolist.controller;

import com.example.todolist.entity.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/**
 *
 */
@RestController
public class MainController {

    //Сделать пагинацию, сортировку, фильтрацию, отметку готовности!!!


    @GetMapping("/lists")          //Вывод всех списков списков дел
    private ResponseEntity list() {
            return ResponseEntity.ok("Вывод всех списков списков дел");
    }

    @GetMapping("/lists/{listId}/tasks")    //Вывод всех дел из какого-то списка
    private void task() {
        System.out.println("Вывод всех дел из какого-то списка");
    }

    @GetMapping("/lists/{listId}")      //Вывод какого-то конкретного списка дел
    private void list1() {
        System.out.println("Вывод какого-то конкретного списка дел");
    }

    @GetMapping("/lists/{listId}/tasks/{taskId}")  //Вывод какого-то конкретного дела из конкретного списка
    private void task1() {
        System.out.println("вывод какого-то конкретного дела из конкретного списка");
    }

    @PostMapping("/lists/add")
    private void add(String name, Lists list) {
        list.setListCreated(LocalDate.now());
        System.out.println("Создан список " + name + "  " + list.getListCreated());
    }

    @PostMapping("/lists/{listId}/tasks/add")
    private void add(String name, Tasks task) {
        task.setTaskCreated(LocalDate.now());
        System.out.println("Создано дело " + name + "  " + task.getTaskCreated());
    }

    @PutMapping("/lists/{listId}") //Изменение параметров какого-то списка дел
    private void update(String name, Lists list) {
        list.setListChange(LocalDate.now());

        System.out.println("Изменен список дел " + name + " дата изменения: " + list.getListChange());
    }

    @PutMapping("/lists/{listId}/tasks/{taskId}")         //Изменение параметров какого-то дела
    private void update(String name, String description, int priority, Tasks task) {
        task.setTaskChange(LocalDate.now());
        System.out.println("Изменено дело " + name + " дата изменения: " + task.getTaskChange());
    }

    @DeleteMapping("/lists/{listId}")   //Удаление списка дел
    public void deleteList(int listId) {
        System.out.println("лист удален");
    }

    @DeleteMapping("/list/{listId}/task/{taskId}")   // Удаление дела из какого-то списка дел
    public void deleteTask(int taskId) {
        System.out.println("дело удалено");
    }
}
