package com.jeluchu.anvflix.models.search

import kotlinx.serialization.Serializable

@Serializable
data class SearchResultsEntity(
    val cover: String,
    val rating: String,
    val slug: String,
    val synopsis: String,
    val title: String,
    val type: String,
    val url: String
)