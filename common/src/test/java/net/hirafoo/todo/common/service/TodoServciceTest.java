package net.hirafoo.todo.common.service;

import lombok.extern.slf4j.Slf4j;
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

@Slf4j
@SpringBootTest
class TodoServiceTest {
    @Autowired
    TodoService todoService;
    @MockBean
    TodoMapper mockTodoMapper;

    @Test
    void testTodoCreate() throws Exception {
        Todo todo = new Todo(
                1,
                "name",
                "desc",
                false,
                0,
                0,
                0
        );
        log.info("id {}", todo.getId());
        assertEquals(todo.getName(), "name");
        assertEquals(todo.getTerm(), 0);
    }
}
