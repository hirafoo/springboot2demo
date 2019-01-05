package net.hirafoo.todo.controller;

import lombok.extern.slf4j.Slf4j;
import net.hirafoo.todo.model.Todo;
import net.hirafoo.todo.service.HelloService;
import net.hirafoo.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
public class RootController {
    @Autowired
    HelloService helloService;
    @Autowired
    TodoService todoService;

    @GetMapping("/")
    public String index(Model model) {
        String hello = helloService.hello("hoge");
        model.addAttribute("hello", hello);

        List<Todo> todoList = todoService.getAll();
        model.addAttribute("todoList", todoList);
        return "index";
    }
}
