package com.jeluchu.anvflix.models.anime

import kotlinx.serialization.Serializable

@Serializable
data class Episode(
    val number: Int,
    val slug: String,
    val url: String
)