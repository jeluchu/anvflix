package com.jeluchu.anvflix.models.lastepisodes

import kotlinx.serialization.Serializable

@Serializable
data class LastEpisodesEntity(
    val cover: String,
    val number: Int,
    val title: String,
    val url: String
)