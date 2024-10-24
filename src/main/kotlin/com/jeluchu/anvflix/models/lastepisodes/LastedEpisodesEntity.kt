package com.jeluchu.anvflix.models.lastepisodes

import kotlinx.serialization.Serializable

@Serializable
data class LastedEpisodesEntity(
    val data: List<LastEpisodesEntity>,
    val success: Boolean
)