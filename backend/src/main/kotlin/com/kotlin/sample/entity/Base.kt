package com.kotlin.sample.entity

import java.time.LocalDateTime

open class Base(
        val creationDate: LocalDateTime = LocalDateTime.now()
)