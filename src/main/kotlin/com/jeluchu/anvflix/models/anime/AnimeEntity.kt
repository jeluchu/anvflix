package com.jeluchu.anvflix.models.anime

import kotlinx.serialization.Serializable

@Serializable
data class AnimeEntity(
    val data: AnimeDataEntity,
    val success: Boolean
)