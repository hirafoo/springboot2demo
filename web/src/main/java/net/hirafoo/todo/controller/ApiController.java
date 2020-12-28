package net.hirafoo.todo.controller;

import lombok.extern.slf4j.Slf4j;
import net.hirafoo.todo.model.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class ApiController {

    @GetMapping("/api/list")
    public List<Item> list() {
        List<Item> items = new ArrayList<Item>();
        for (int i = 0; i < 20; i++) {
            items.add(new Item(
                    i,
                    "name_" + i,
                    "desc_" + i,
                    false,
                    LocalDateTime.now(),
                    null
                    ));
        }
        return items;
    }
}
