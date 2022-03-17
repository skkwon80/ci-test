package com.example.citest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@SuppressWarnings("SpreadOperator")
class CiTestApplication

fun main(args: Array<String>) {
    runApplication<CiTestApplication>(*args)

}
