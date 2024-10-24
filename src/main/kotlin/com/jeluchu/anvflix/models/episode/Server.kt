package com.jeluchu.anvflix.models.episode

import kotlinx.serialization.Serializable

@Serializable
data class Server(
    val name: String,
    val embed: String? = null,
    val download: String? = null
)