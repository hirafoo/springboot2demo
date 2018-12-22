package net.hirafoo.todo.model;

import lombok.Data;

@Data
public class Item {
    private int id;
    private String name;
    public Item(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}

