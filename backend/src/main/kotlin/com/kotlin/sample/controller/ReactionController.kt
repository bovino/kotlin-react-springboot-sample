package com.kotlin.sample.controller

import com.kotlin.sample.entity.Reaction
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class ReactionController {

    @GetMapping("/reactions/question/{questionId}")
    fun reactionsToQuestion(@PathVariable questionId: Int): List<Reaction> {
        return mutableListOf<Reaction>()
    }

    @GetMapping("/reactions/answer/{answerId}")
    fun reactionsToAnswer(@PathVariable answerId: Int): List<Reaction> {
        return mutableListOf<Reaction>()
    }

}