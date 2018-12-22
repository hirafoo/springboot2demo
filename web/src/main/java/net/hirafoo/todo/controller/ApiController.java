package net.hirafoo.todo.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class ApiController {

    @GetMapping("/api/list")
    public List<Item> list(Pageable pageable) {
        log.info("{}", pageable);
        List<Item> items = new ArrayList<Item>();
        for (int i = 0; i < 20; i++) {
            items.add(new Item(i, "name_" + i));
        }
        return items;
    }

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
}
