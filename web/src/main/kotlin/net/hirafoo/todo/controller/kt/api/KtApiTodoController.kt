package net.hirafoo.todo.controller.kt.api

import net.hirafoo.todo.model.Todo
import net.hirafoo.todo.service.TodoService
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class KtApiTodoController(
    private val todoService: TodoService
) {
    @GetMapping("/kt/api/todo/detail/{id}")
    fun detail(
        model: Model,
        @PathVariable("id") id: Long
    ): Todo {
        val todo = todoService.retrieve(id)
        return todo
    }
}
