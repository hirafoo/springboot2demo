package net.hirafoo.todo.common.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import net.hirafoo.todo.common.mapper.TodoMapper;
import net.hirafoo.todo.common.model.Todo;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TodoService {
    private final TodoMapper todoMapper;
    public static final ZoneId ZONE_ID_DEFAULT = ZoneId.systemDefault();
    ZoneOffset ZONE_OFFSET_DEFAULT = ZoneId.systemDefault().getRules().getOffset(Instant.now());


    public List<Todo> getAll() {
        List<Todo> list = todoMapper.selectAll();
        return list;
    }

    public void create(
            String name,
            String description,
            LocalDateTime term
    ) {
        int epoch = (int)term.atZone(ZONE_ID_DEFAULT).toEpochSecond();
        todoMapper.create(
                name,
                description,
                epoch
        );
    }

    public Todo retrieve(Long id) {
        return todoMapper.retrieve(id);
    }

    public void edit(
            Long id,
            @Nullable String name,
            @Nullable String description,
            @Nullable Boolean done,
            @Nullable Integer term) {
        var todo = todoMapper.retrieve(id);
        todoMapper.edit(
                todo.getId(),
                name,
                description,
                done,
                term
                //(int)todo.getTerm().atZone(ZONE_ID_DEFAULT).toEpochSecond()
        );
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
