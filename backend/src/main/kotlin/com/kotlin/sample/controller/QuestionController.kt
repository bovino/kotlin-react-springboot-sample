package com.kotlin.sample.controller

import com.kotlin.sample.entity.Question
import com.kotlin.sample.service.QuestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("questions")
class QuestionController {

    @Autowired
    lateinit var questionService: QuestionService

    @GetMapping("/")
    fun questions(): List<Question> {
        return questionService.findAll()
    }

    @PutMapping("/")
    fun addQuestion(@RequestBody newQuestion: Question): Question {
        return questionService.addQuestion(newQuestion)
    }

    @PostMapping("/")
    fun updateQuestion(@RequestBody updatedQuestion: Question): Question {
        return questionService.updateQuestion(updatedQuestion)
    }

}