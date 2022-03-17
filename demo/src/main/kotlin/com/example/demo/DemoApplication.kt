package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@SuppressWarnings("SpreadOperator")
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
