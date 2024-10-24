package com.jeluchu.anvflix

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class AnimeSearch {
    @Test
    fun `on getSearch and return on air animes list`() {
        val result = runBlocking { Anvflix.getSearch("Steins;Gate") }
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