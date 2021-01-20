package net.hirafoo.todo.model

import java.time.LocalDateTime

data class Todo(
    var id: Long = 0,
    var name: String? = null,
    var description: String? = null,
    var done: Boolean = false,
    var term: LocalDateTime = LocalDateTime.MIN,
    //var term: Int = 0,
    //var createdAt: LocalDateTime = LocalDateTime.MIN,
    var createdAt: Int = 0,
    //var updatedAt: LocalDateTime? = null
    var updatedAt: Int = 0
)
