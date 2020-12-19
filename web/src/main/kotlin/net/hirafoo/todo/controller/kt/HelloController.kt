package net.hirafoo.todo.controller.kt

import net.hirafoo.todo.service.SampleService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/kt")
class HelloController(
    private val sampleService: SampleService
) {
    @GetMapping("hello")
    fun hello(
        model: Model,
        @RequestParam("num", required = false) num: Int?
    ): String {
        model["result"] = sampleService.hoge(num)
        return "kt/hello"
    }
}
