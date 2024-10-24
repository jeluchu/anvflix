package com.jeluchu.anvflix.core.client

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import okhttp3.Protocol

open class AnvflixClient {
    protected val httpClient by lazy {
        HttpClient(OkHttp) {
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }
            engine {
                config {
                    protocols(listOf(Protocol.HTTP_1_1))
                    retryOnConnectionFailure(true)
                }
            }

            expectSuccess = false
        }
    }
}