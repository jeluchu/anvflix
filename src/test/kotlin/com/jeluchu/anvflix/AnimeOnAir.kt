package com.jeluchu.anvflix

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class AnimeOnAir {
    @Test
    fun `on getOnAir and return on air animes list`() {
        val result = runBlocking { Anvflix.getOnAir() }
        assert(result?.isNotEmpty() == true)
    }

    companion object {
        @BeforeAll
        @JvmStatic
        internal fun setup() {
            Anvflix
        }
    }
}