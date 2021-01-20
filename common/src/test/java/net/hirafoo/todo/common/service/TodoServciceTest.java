package net.hirafoo.todo.common.service;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import net.hirafoo.todo.model.Todo;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import net.hirafoo.todo.service.TodoService;
import net.hirafoo.todo.mapper.TodoMapper;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Slf4j
@SpringBootTest
class TodoServiceTest {
    @Autowired
    TodoService todoService;
    //@MockBean
    //TodoMapper mockTodoMapper;
    @Autowired
    TodoMapper todoMapper;

    public static final ZoneId ZONE_ID_DEFAULT = ZoneId.systemDefault();

    @Test
    @Transactional
    void testTodoCreate() throws Exception {
//        LocalDateTime term =
 ////               LocalDateTime.ofInstant(Instant.ofEpochSecond(1611141082), ZONE_ID_DEFAULT);
        val term = 1611141082;

        log.info("====================");
        log.info("{}", term);
        log.info("====================");
        todoMapper.create(
                "name",
                "description",
                term
        );
        Todo todo = todoMapper.getLast();
        assertEquals(todo.getName(), "name");
        todoService.edit(
                todo.getId(),
                todo.getName(),
                todo.getDescription(),
                todo.getDone(),
                term
        );
        todo = todoMapper.getLast();
        //assertEquals(todo.getTerm(), 0);
        log.info("{}", todo);
        assertEquals(todo.getTerm().toString(), "2021-01-20 20:11:22");
    }
}
