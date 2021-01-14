package net.hirafoo.todo.model

import java.time.LocalDateTime

data class Item(
    var id: Int = 0,
    var name: String? = null,
    var description: String? = null,
    var done: Boolean = false,
    var term: LocalDateTime = LocalDateTime.MIN,
    var createdAt: LocalDateTime = LocalDateTime.MIN,
    var updatedAt: LocalDateTime? = null
)
