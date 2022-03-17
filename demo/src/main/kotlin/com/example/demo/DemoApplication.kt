package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

@SuppressWarnings("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
