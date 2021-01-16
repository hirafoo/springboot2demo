package net.hirafoo.todo.service

import org.springframework.stereotype.Service

fun main() {
}
@Service
class SampleKotlinService() {

    fun hoge(argNum: Int?): String {
        val num = argNum ?: 10
        return if (num > 10) {
            "high"
        } else if (num > 5) {
            "mid"
        } else {
            "low"
        }
    }
}
