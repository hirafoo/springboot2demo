package net.hirafoo.todo.controller;

import lombok.extern.slf4j.Slf4j;
import net.hirafoo.todo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//@Controller
public class RootController {
    @Autowired
    HelloService helloService;

    @GetMapping("/")
    public String index(Model model) {
        //log.info("{}", "hoge");
        String hello = helloService.hello("hoge");
        //model.addAttribute("hello", hello);
        return hello;
    }
}
