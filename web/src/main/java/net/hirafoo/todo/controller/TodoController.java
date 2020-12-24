package net.hirafoo.todo.controller;

import net.hirafoo.todo.model.Todo;
import net.hirafoo.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
    @Autowired
    TodoService todoService;

    @PostMapping("/todo/create")
    public String create(
            @RequestParam(value="name", required = true) String name,
            @RequestParam(value="description", required = true) String description
    ) {
        todoService.create(name, description);
        return "redirect:/";
    }

    @PostMapping("/todo/done")
    public String deone(
            @RequestParam(value="id", required = true) Long id
    ) {
        todoService.done(id);
        return "redirect:/";
    }

    @PostMapping("/todo/delete")
    public String delete(
            @RequestParam(value="id", required = true) Long id
    ) {
        todoService.delete(id);
        return "redirect:/";
    }
}
