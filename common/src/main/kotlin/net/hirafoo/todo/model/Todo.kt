package net.hirafoo.todo.model

import java.time.LocalDateTime

data class Todo(
    var id: Long = 0,
    var name: String = "",
    var description: String = "",
    var done: Boolean = false,
    var term: LocalDateTime = LocalDateTime.MIN,
    var createdAt: LocalDateTime = LocalDateTime.now(),
    var updatedAt: LocalDateTime? = null
)
