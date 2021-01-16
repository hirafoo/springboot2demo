package net.hirafoo.todo.controller.kt.api

import mu.KotlinLogging
import net.hirafoo.todo.model.Todo
import net.hirafoo.todo.service.TodoService
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kt/api/todo")
class KtApiTodoController(
    private val todoService: TodoService
) {
    companion object {
        private val log = KotlinLogging.logger {}
    }

    @GetMapping("/detail/{id}")
    fun detail(
        model: Model,
        @PathVariable("id") id: Long
    ): Todo {
        log.info("id : {}", id)
        val todo = todoService.retrieve(id)
        return todo
    }
}
