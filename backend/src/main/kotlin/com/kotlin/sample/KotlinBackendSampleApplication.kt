package com.kotlin.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBackendSampleApplication

fun main(args: Array<String>) {
	runApplication<KotlinBackendSampleApplication>(*args)
}
