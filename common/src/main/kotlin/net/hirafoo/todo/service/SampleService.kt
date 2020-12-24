package net.hirafoo.todo.service

import org.springframework.stereotype.Service

@Service
class SampleService() {

    fun hoge(argNum: Int?):String {
        val num = argNum ?: 10
        val result: String = if (num > 10) {
            "high"
        } else if (num > 5) {
            "mid"
        } else {
            "low"
        }
        return result
    }
}
