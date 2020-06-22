package com.kotlin.sample.entity

import javax.persistence.*

@Entity
data class Answer (
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     val id: Int = 0,
     val text: String,
     val user: String,
     @ManyToOne(fetch = FetchType.LAZY, optional = false)
     @JoinColumn(name = "question_id")
     val question: Question? = null

) : Base() {
    // reactions of the answer
    @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY, mappedBy = "answer")
    private val _reactions = mutableListOf<Reaction>()
    @Transient
    val reactions = _reactions.toList()
    fun addReactionItem(newItem: Reaction) = this._reactions.plusAssign(newItem)
}