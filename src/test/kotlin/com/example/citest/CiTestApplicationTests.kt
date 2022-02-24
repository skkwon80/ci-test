package com.example.citest

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CiTestApplicationTests {

    @Test
    fun trueTest() {
        assert(true)
    }

    @Test
    fun falseTest() {
        assert(false)
    }

    @Test
    fun `한글`() {
        assert(false)
    }
}
