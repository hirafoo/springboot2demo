package net.hirafoo.todo.common.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {
    public String hello(String name) {
        return "hello " + name;
    }
}
