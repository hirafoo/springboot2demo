package net.hirafoo.todo.controller.kt

import mu.KotlinLogging
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/kt/loop")
class LoopController {

    companion object {
        private val log = KotlinLogging.logger {}
    }

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
                    log.info("while : result = {}", result)
                }
            }
        }
        model["result"] = result
        model["type"] = "while"
        return "kt/loop/loop_sample"
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
                log.info("for : result = {}", result)
            }
        }
        model["result"] = result
        model["type"] = "for"
        return "kt/loop/loop_sample"
    }
}
