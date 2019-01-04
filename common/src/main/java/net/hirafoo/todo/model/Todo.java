package net.hirafoo.todo.model;

import lombok.Data;

@Data
public class Todo {
    Long id;
    String name;
    String description;

    public Todo(Long id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
