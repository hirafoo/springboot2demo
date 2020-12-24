package net.hirafoo.todo.controller.kt

import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/kt/loop")
class LoopController {

    @GetMapping("while_sample")
    fun whileSample(
        model: Model,
        @RequestParam("num", required = false) num: Int?
    ): String {
        var result = 1
        if (num != null) {
            var loop = num
            if (loop > 0) {
                while (loop > 0) {
                    result++
                    loop--
                }
            }
        }
        model["result"] = result
        return "kt/loop/while_sample"
    }

    @GetMapping("for_sample")
    fun forSample(
        model: Model,
        @RequestParam("num", required = false) num: Int?
    ): String {
        var result = 0
        if (num != null) {
            for (i in 0 until num) {
                result += i
            }
        }
        model["result"] = result
        return "kt/loop/while_sample"
    }
}
