package com.jeluchu.anvflix.models.onair

import kotlinx.serialization.Serializable

@Serializable
data class OnAirEntity(
    val slug: String,
    val title: String,
    val type: String,
    val url: String
)