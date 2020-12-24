package net.hirafoo.todo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.hirafoo.todo.mapper.TodoMapper;
import net.hirafoo.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TodoService {

    @Autowired
    TodoMapper todoMapper;

    private static String DBFILE = "/tmp/todo.list";

    public List<Todo> getAll() {
        List<Todo> list = todoMapper.selectAll();
        return list;
    }

    public void create(String name, String description) {
        todoMapper.create(name, description);
        return;
    }

    public void done(Long id) {
        todoMapper.done(id);
    }

    public void delete(Long id) {
        todoMapper.delete(id);
    }

    public Todo getLast() {
        return todoMapper.getLast();
    }

    public void truncate() {
        todoMapper.truncate();
    }
}
