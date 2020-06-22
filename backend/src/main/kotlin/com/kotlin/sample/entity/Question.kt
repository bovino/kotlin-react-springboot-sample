package com.kotlin.sample.entity

import javax.persistence.*

@Entity
data class Question (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,
        val text: String,
        val user: String
) : Base() {
        // reactions of this question
        @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY, mappedBy = "question")
        private val _reactions = mutableListOf<Reaction>()
        @Transient
        val reactions = _reactions.toList()
        fun addReactionItem(newItem: Reaction) = this._reactions.plusAssign(newItem)

        // answers of this question
        @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY, mappedBy = "question")
        private val _answers = mutableListOf<Answer>()
        @Transient
        val answers = _answers.toList()
        fun addAnswerItem(newItem: Answer) = this._answers.plusAssign(newItem)
}