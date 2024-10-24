package com.jeluchu.anvflix.models.episode

import kotlinx.serialization.Serializable

@Serializable
data class AnimeEpisodeEntity(
    val data: EpisodeEntity,
    val success: Boolean
)