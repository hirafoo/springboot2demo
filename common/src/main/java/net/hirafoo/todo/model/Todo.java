package net.hirafoo.todo.model;

import lombok.Data;

@Data
public class Todo {
    public Long id;
    public String name;
    public String description;
    // TODO why long?
    public Long createdAt;
    public Long updatedAt;
}
