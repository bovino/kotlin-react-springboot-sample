package com.kotlin.sample.service

import com.kotlin.sample.entity.Question
import com.kotlin.sample.repository.QuestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class QuestionService {

    @Autowired
    lateinit var questionRepository: QuestionRepository

    fun addQuestion(newAnswer: Question): Question {
        return questionRepository.save(newAnswer)
    }

    fun updateQuestion(updatedAnswer: Question): Question {
        return questionRepository.saveAndFlush(updatedAnswer)
    }

    fun findAll(): List<Question> {
        return questionRepository.findAll()
    }

}