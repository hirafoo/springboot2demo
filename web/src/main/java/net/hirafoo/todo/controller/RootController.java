package net.hirafoo.todo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import net.hirafoo.todo.model.Todo;
import net.hirafoo.todo.service.HelloService;
import net.hirafoo.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class RootController {
    private final HelloService helloService;
    private final TodoService todoService;

    @GetMapping("/")
    public String index(Model model) {
        log.info("hoge {}", "hoge");
        String hello = helloService.hello("hoge");
        model.addAttribute("hello", hello);

        List<Todo> todoList = todoService.getAll();
        model.addAttribute("todoList", todoList);
        return "index";
    }

    @GetMapping("/make_many")
    public String makeMany() {
        Todo lastTodo = todoService.getLast();
        Long id;
        if (lastTodo == null) {
            id = 1L;
        } else {
            id = lastTodo.getId() + 1L;
        }
        for (int i=0; i<10; i++) {
            var term = LocalDateTime.of(
                    2020,1,1,0,0,i
            );
            todoService.create("name"+id, "description"+id, term);
            id++;
        }
        return "redirect:/";
    }

    @GetMapping("/truncate")
    public String truncate() {
        todoService.truncate();
        return "redirect:/";
    }
}
