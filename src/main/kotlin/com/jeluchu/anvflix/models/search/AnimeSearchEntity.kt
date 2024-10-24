package com.jeluchu.anvflix.models.search

import kotlinx.serialization.Serializable

@Serializable
data class AnimeSearchEntity(
    val data: SearchEntity,
    val success: Boolean
)