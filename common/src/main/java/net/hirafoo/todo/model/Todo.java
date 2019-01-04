package net.hirafoo.todo.model;

import lombok.Data;

@Data
public class Todo {
    private Long id;
    private String name;
    private String description;

    private Todo(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }
}
