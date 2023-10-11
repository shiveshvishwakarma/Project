package com.lcwd.todo.controllers;

import com.lcwd.todo.models.Todo;
import com.lcwd.todo.services.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController {

    Logger logger= LoggerFactory.getLogger(TodoController.class);
    @Autowired
    private TodoService todoService;

    @PostMapping
    public Todo createTodoHandler(@RequestBody Todo todo){
        logger.info("Create Todo");

        Todo todo1 = todoService.createTodo(todo);
        return todo1;

    }
}
