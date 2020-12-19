package net.hirafoo.todo.controller.kt

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/kt")
class Hello {
    @GetMapping("hello")
    fun hello(model: Model): String {
        model["title"] = "hoge"
        return "kt/hello"
    }
}
