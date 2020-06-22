package com.kotlin.sample.repository

import com.kotlin.sample.entity.Reaction
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ReactionRepository : JpaRepository<Reaction, Long> {

}