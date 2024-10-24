package com.jeluchu.anvflix.core.connection

import com.jeluchu.anvflix.core.client.AnvflixClient
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

/**
 * Class that handle request.
 */
class RestClient : AnvflixClient() {
    suspend inline fun <reified T> request(endPoint: String): T? {
        return try {
            jsonClient.get(baseUrl + endPoint).body<T>()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    companion object {
        const val baseUrl = "https://animeflv.ahmedrangel.com/api/"
    }

    @PublishedApi
    internal val jsonClient: HttpClient
        get() = httpClient
}