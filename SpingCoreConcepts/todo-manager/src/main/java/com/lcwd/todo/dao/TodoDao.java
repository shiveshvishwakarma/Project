package com.lcwd.todo.dao;

import com.lcwd.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TodoDao {

    Logger logger= LoggerFactory.getLogger(TodoDao.class);

    @Autowired
    private JdbcTemplate template;

    public TodoDao( @Autowired JdbcTemplate template) {
        this.template = template;

        //create table if  does not exit

        String createtable="create table IF EXISTS todos(id int primary key,title varchar(100) not null,contant varchar(500),status varchar(10) not null)";
        int update= template.update(createtable);
        logger.info("TODO TABLE CREATED {} ",update);
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // save todo in database
    public Todo saveTodo( Todo todo){

        String insertQuery="insert into todos(id,title,content,status) values(?,?,?,?)";

        int rows = template.update(insertQuery,todo.getId(),todo.getTitle(),todo.getContent(),todo.getStatus());

        logger.info("JDBC OPERATION: {} inserted", rows);

        return todo;


    }

    //get single todo from database

    //get all todo from database

    //update todo
}
