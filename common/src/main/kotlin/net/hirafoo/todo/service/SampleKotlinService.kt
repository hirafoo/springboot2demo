package net.hirafoo.todo.service

import net.hirafoo.todo.model.Item
import org.springframework.stereotype.Service
import kotlin.reflect.full.declaredMembers

fun main() {
    val sampleKotlinService = SampleKotlinService()
    sampleKotlinService.reflectionTest()
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

    fun reflectionTest() {
        val item = Item(100, "hoge")
        println(Item::class)

        for (param in Item::class.declaredMembers) {
            println(param)
        }

        println()

        for (i in item::class.members) {
            println(i)
        }
    }
}
