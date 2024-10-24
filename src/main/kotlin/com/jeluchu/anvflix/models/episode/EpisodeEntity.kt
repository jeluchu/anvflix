package com.jeluchu.anvflix.models.episode

import kotlinx.serialization.Serializable

@Serializable
data class EpisodeEntity(
    val number: Int,
    val servers: List<Server>,
    val title: String
)