package com.kotlin.sample.controller

import com.kotlin.sample.entity.Reaction
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("reactions")
class ReactionController {

    @GetMapping("/question/{questionId}")
    fun reactionsToQuestion(@PathVariable questionId: Int): List<Reaction> {
        return mutableListOf<Reaction>()
    }

    @GetMapping("/answer/{answerId}")
    fun reactionsToAnswer(@PathVariable answerId: Int): List<Reaction> {
        return mutableListOf<Reaction>()
    }

    @PutMapping("/")
    fun addReaction(@RequestBody newReaction: Reaction): Reaction {
        return newReaction
    }

}