package net.hirafoo.todo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.hirafoo.todo.model.Todo;
import net.hirafoo.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@RequiredArgsConstructor
@Controller
public class TodoController {
    private final TodoService todoService;

    @PostMapping("/todo/create")
    public String create(
            @RequestParam(value="name", required = true) String name,
            @RequestParam(value="description", required = true) String description
    ) {
        todoService.create(name, description);
        return "redirect:/";
    }

    @GetMapping("/todo/edit/{id}")
    public String edit(
            Model model,
            @PathVariable("id") Long id
    ) {
        log.info("id = {}", id);
        //Todo todo = todoService.retrieve(id);
        Todo todo = todoService.getLast();
        model.addAttribute("todo", todo);
        return "todo/edit";
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
