package net.hirafoo.todo.service;

import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.hirafoo.todo.mapper.TodoMapper;
import net.hirafoo.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TodoService {
    private final TodoMapper todoMapper;
    private static String DBFILE = "/tmp/todo.list";

    public List<Todo> getAll() {
        List<Todo> list = todoMapper.selectAll();
        return list;
    }

    public void create(String name, String description) {
        todoMapper.create(name, description);
        return;
    }

    public Todo retrieve(Long id) {
        return todoMapper.retrieve(id);
    }

    public void edit(
            Long id,
            @Nullable String name,
            @Nullable String description) {
        todoMapper.edit(id, name, description);
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
