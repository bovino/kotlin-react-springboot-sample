package com.kotlin.sample.controller

import com.kotlin.sample.entity.Question
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class QuestionController {

    @GetMapping("/questions")
    fun questions(): List<Question> {
        return mutableListOf<Question>()
    }

}