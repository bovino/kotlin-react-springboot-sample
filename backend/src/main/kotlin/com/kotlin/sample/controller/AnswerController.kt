package com.kotlin.sample.controller

import com.kotlin.sample.entity.Answer
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
class AnswerController {

    @GetMapping("/answers/question/{questionId}")
    fun answersToQuestion(@PathVariable questionId: Int): List<Answer> {
        return mutableListOf<Answer>()
    }

    @PutMapping("/answer")
    fun addAnswer(@RequestBody newAnswer: Answer): Answer {
        return newAnswer
    }

    @PostMapping("/answer")
    fun updateAnswer(@RequestBody newAnswer: Answer): Answer {
        return newAnswer
    }

    @DeleteMapping("/answer/{id}")
    fun deleteAnswer(@PathVariable id: Int): Boolean {
        return true
    }

}