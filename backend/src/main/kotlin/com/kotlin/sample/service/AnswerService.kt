package com.kotlin.sample.service

import com.kotlin.sample.entity.Answer
import com.kotlin.sample.repository.AnswerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class AnswerService {

    @Autowired
    lateinit var answerRepository: AnswerRepository

    fun answersToQuestion(questionId: Int): List<Answer> {
        return answerRepository.findAll()
    }

    fun addAnswer(newAnswer: Answer): Answer {
        return answerRepository.save(newAnswer)
    }

    fun updateAnswer(updatedAnswer: Answer): Answer {
        return answerRepository.saveAndFlush(updatedAnswer)
    }

}