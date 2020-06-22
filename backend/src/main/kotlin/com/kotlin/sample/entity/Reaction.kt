package com.kotlin.sample.entity

import javax.persistence.*

@Entity
data class Reaction (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,
        val text: String,
        val user: String,
        val isPositive: Boolean,
        @ManyToOne(fetch = FetchType.LAZY, optional = true)
        @JoinColumn(name = "answer_id")
        val answer: Answer? = null,
        @ManyToOne(fetch = FetchType.LAZY, optional = true)
        @JoinColumn(name = "question_id")
        val question: Question? = null
) : Base()