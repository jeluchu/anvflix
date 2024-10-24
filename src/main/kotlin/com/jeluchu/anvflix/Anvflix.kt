package com.jeluchu.anvflix

import com.jeluchu.anvflix.core.connection.RestClient
import com.jeluchu.anvflix.models.anime.AnimeDataEntity
import com.jeluchu.anvflix.models.anime.AnimeEntity
import com.jeluchu.anvflix.models.episode.AnimeEpisodeEntity
import com.jeluchu.anvflix.models.episode.EpisodeEntity
import com.jeluchu.anvflix.models.lastepisodes.LastEpisodesEntity
import com.jeluchu.anvflix.models.lastepisodes.LastedEpisodesEntity
import com.jeluchu.anvflix.models.onair.AnimesOnAirEntity
import com.jeluchu.anvflix.models.onair.OnAirEntity
import com.jeluchu.anvflix.models.search.AnimeSearchEntity
import com.jeluchu.anvflix.models.search.SearchResultsEntity

object Anvflix {
    private var restClient = RestClient()

    /**
     * Function to get all anime returned after a search.
     * @return List of anime that have a similar title to the one in the query
     * @see SearchResultsEntity
     */
    suspend fun getSearch(anime: String): List<SearchResultsEntity>? =
        restClient.request<AnimeSearchEntity>("search?query=$anime")?.data?.media

    /**
     * Function to get all information of anime.
     * @return Anime information
     * @see AnimeDataEntity
     */
    suspend fun getAnime(anime: String): AnimeDataEntity? =
        restClient.request<AnimeEntity>("anime/${anime}")?.data

    /**
     * Function to get all information of episodes.
     * @return Episodes information
     * @see EpisodeEntity
     */
    suspend fun getEpisodes(id: String): EpisodeEntity? =
        restClient.request<AnimeEpisodeEntity>("anime/episode/${id}")?.data

    suspend fun getEpisodes(anime: String, episode: Int): EpisodeEntity? =
        restClient.request<AnimeEpisodeEntity>("anime/$anime/episode/$episode")?.data

    /**
     * Function to get the anime that are currently on air.
     * @return Links of animes
     * @see OnAirEntity
     */
    suspend fun getOnAir(): List<OnAirEntity>? =
        restClient.request<AnimesOnAirEntity>("list/animes-on-air")?.data

    /**
     * Function to get the last episodes.
     * @return Lasted episodes of animes
     * @see LastEpisodesEntity
     */
    suspend fun getLastEpisodes(): List<LastEpisodesEntity>? =
        restClient.request<LastedEpisodesEntity>("list/latest-episodes")?.data
}