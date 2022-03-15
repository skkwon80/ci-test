package com.example.citest

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FailTests {

    @Test
    fun `fail`() {
        assert(false)
    }

    @Test
    fun `실패`() {
        assert(false)
    }
}
