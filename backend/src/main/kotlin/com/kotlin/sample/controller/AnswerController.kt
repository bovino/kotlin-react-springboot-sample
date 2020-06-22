package com.kotlin.sample.controller

import com.kotlin.sample.entity.Answer
import com.kotlin.sample.service.AnswerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("answers")
class AnswerController {

    @Autowired
    lateinit var answerService: AnswerService

    @GetMapping("/question/{questionId}")
    fun answersToQuestion(@PathVariable questionId: Int): List<Answer> {
        return answerService.answersToQuestion(questionId)
    }

    @PutMapping("/")
    fun addAnswer(@RequestBody newAnswer: Answer): Answer {
        return answerService.addAnswer(newAnswer)
    }
}