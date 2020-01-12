package com.odyssey.funny

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class FunnyApplication

fun main(args: Array<String>) {
	runApplication<FunnyApplication>(*args)
}
