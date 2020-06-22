package com.kotlin.sample.service

import com.kotlin.sample.entity.Reaction
import com.kotlin.sample.repository.ReactionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class ReactionService {

    @Autowired
    lateinit var reactionRepository: ReactionRepository

    fun addQuestion(newReaction: Reaction): Reaction {
        return reactionRepository.save(newReaction)
    }

    fun updateQuestion(updatedReaction: Reaction): Reaction {
        return reactionRepository.saveAndFlush(updatedReaction)
    }

}