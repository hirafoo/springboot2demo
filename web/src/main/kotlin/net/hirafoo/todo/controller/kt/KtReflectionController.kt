package net.hirafoo.todo.controller.kt

import mu.KotlinLogging
import net.hirafoo.todo.model.Item
import net.hirafoo.todo.service.SampleKotlinService
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kt/reflection")
class KtReflectionController(
    private val sampleKotlinService: SampleKotlinService
) {
    companion object {
        private val log = KotlinLogging.logger {}
    }

    @GetMapping("/item")
    fun item(
        model: Model
    ): Item {
        log.info(Item::class.toString())
        return Item(1, "hoge")
    }
}
