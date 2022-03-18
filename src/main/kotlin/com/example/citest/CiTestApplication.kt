package com.example.citest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiTestApplication

@SuppressWarnings("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<CiTestApplication>(*args)
}

fun test() {
}
