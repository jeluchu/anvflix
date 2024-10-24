package com.jeluchu.anvflix

import com.jeluchu.anvflix.models.anime.AnimeDataEntity
import com.jeluchu.anvflix.models.anime.Episode
import com.jeluchu.anvflix.models.episode.EpisodeEntity
import com.jeluchu.anvflix.models.episode.Server
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class AnimeTests {
    @Test
    fun `on getAnime pass a query and return anime info`() {
        val anime = AnimeDataEntity(
            alternativeTitles = listOf("カミエラビ GOD.app", "KamiErabi GOD.app"),
            cover = "https://animeflv.net/uploads/animes/covers/3882.jpg",
            episodes = listOf(
                Episode(number = 1, slug = "Kamierabi-1", url = "https://www3.animeflv.net/ver/Kamierabi-1"),
                Episode(number = 2, slug = "Kamierabi-2", url = "https://www3.animeflv.net/ver/Kamierabi-2"),
                Episode(number = 3, slug = "Kamierabi-3", url = "https://www3.animeflv.net/ver/Kamierabi-3"),
                Episode(number = 4, slug = "Kamierabi-4", url = "https://www3.animeflv.net/ver/Kamierabi-4"),
                Episode(number = 5, slug = "Kamierabi-5", url = "https://www3.animeflv.net/ver/Kamierabi-5"),
                Episode(number = 6, slug = "Kamierabi-6", url = "https://www3.animeflv.net/ver/Kamierabi-6"),
                Episode(number = 7, slug = "Kamierabi-7", url = "https://www3.animeflv.net/ver/Kamierabi-7"),
                Episode(number = 8, slug = "Kamierabi-8", url = "https://www3.animeflv.net/ver/Kamierabi-8"),
                Episode(number = 9, slug = "Kamierabi-9", url = "https://www3.animeflv.net/ver/Kamierabi-9"),
                Episode(number = 10, slug = "Kamierabi-10", url = "https://www3.animeflv.net/ver/Kamierabi-10"),
                Episode(number = 11, slug = "Kamierabi-11", url = "https://www3.animeflv.net/ver/Kamierabi-11"),
                Episode(number = 12, slug = "Kamierabi-12", url = "https://www3.animeflv.net/ver/Kamierabi-12"),
                Episode(number = 13, slug = "Kamierabi-13", url = "https://www3.animeflv.net/ver/Kamierabi-13"),
                Episode(number = 14, slug = "Kamierabi-14", url = "https://www3.animeflv.net/ver/Kamierabi-14"),
                Episode(number = 15, slug = "Kamierabi-15", url = "https://www3.animeflv.net/ver/Kamierabi-15"),
                Episode(number = 16, slug = "Kamierabi-16", url = "https://www3.animeflv.net/ver/Kamierabi-16")
            ),
            genres = listOf("Acción", "Suspenso"),
            rating = "2.6",
            status = "En emision",
            synopsis = "Ha dado comienzo el battle royale por la divinidad. Unos estudiantes tendrán que usar sus poderes únicos para competir entre ellos por el ansiado título de \"Dios\". Pero a medida que cada combate se vuelve más cruento que el anterior, se forman alianzas y se producen traiciones. ¿Quién saldrá victorioso y reclamará su trono divino?",
            title = "Kamierabi",
            type = "Anime",
            url = "https://www3.animeflv.net/anime/Kamierabi"
        )
        val result = runBlocking { Anvflix.getAnime("Kamierabi") }

        if (result != null) {
            assertEquals(anime.type, result.type)
            assertEquals(anime.title, result.title)
            assertEquals(anime.genres, result.genres)
        }
    }

    @Test
    fun `on getEpisode pass a query and return anime episode info`() {
        val episode = EpisodeEntity(
            number = 1,
            title = "Kamierabi",
            servers = listOf(
                Server(
                    name = "MEGA",
                    download = "https://mega.nz/file/0D0x0IwB!7aCF6fUV5visLOxWP4HFYXS9gke07r-evEysmL3bQmQ",
                    embed = "https://mega.nz/embed/!0D0x0IwB!7aCF6fUV5visLOxWP4HFYXS9gke07r-evEysmL3bQmQ"
                ),
                Server(
                    name = "SW",
                    embed = "https://streamwish.to/e/rdr3v3yszt67"
                ),
                Server(
                    name = "YourUpload",
                    embed = "https://www.yourupload.com/embed/21WOcrfryQN1"
                ),
                Server(
                    name = "Okru",
                    embed = "https://ok.ru/videoembed/6646433188362"
                ),
                Server(
                    name = "Maru",
                    embed = "https://my.mail.ru/video/embed/7512958666216051723#aylaz9ymde#5131"
                ),
                Server(
                    name = "Netu",
                    embed = "https://hqq.tv/player/embed_player.php?vid=bzlxbS8zSUdMRDNEb215ZW9NQXhqQT09"
                ),
                Server(
                    name = "Stape",
                    download = "https://streamtape.com/v/qx68wLzp0JfzGOj/",
                    embed = "https://streamtape.com/e/qx68wLzp0JfzGOj/"
                ),
                Server(
                    name = "1Fichier",
                    download = "https://1fichier.com/?ciaq6q5ppy56xmx9xfz5"
                )
            )
        )
        val result = runBlocking { Anvflix.getEpisodes("Kamierabi-1") }

        if (result != null) {
            assertEquals(episode.title, result.title)
            assertEquals(episode.number, result.number)
            assertEquals(episode.servers, result.servers)
        }
    }

    @Test
    fun `on getEpisode pass a query name and episode number to get anime episode info`() {
        val episode = EpisodeEntity(
            number = 1,
            title = "Kamierabi",
            servers = listOf(
                Server(
                    name = "MEGA",
                    download = "https://mega.nz/file/0D0x0IwB!7aCF6fUV5visLOxWP4HFYXS9gke07r-evEysmL3bQmQ",
                    embed = "https://mega.nz/embed/!0D0x0IwB!7aCF6fUV5visLOxWP4HFYXS9gke07r-evEysmL3bQmQ"
                ),
                Server(
                    name = "SW",
                    embed = "https://streamwish.to/e/rdr3v3yszt67"
                ),
                Server(
                    name = "YourUpload",
                    embed = "https://www.yourupload.com/embed/21WOcrfryQN1"
                ),
                Server(
                    name = "Okru",
                    embed = "https://ok.ru/videoembed/6646433188362"
                ),
                Server(
                    name = "Maru",
                    embed = "https://my.mail.ru/video/embed/7512958666216051723#aylaz9ymde#5131"
                ),
                Server(
                    name = "Netu",
                    embed = "https://hqq.tv/player/embed_player.php?vid=bzlxbS8zSUdMRDNEb215ZW9NQXhqQT09"
                ),
                Server(
                    name = "Stape",
                    download = "https://streamtape.com/v/qx68wLzp0JfzGOj/",
                    embed = "https://streamtape.com/e/qx68wLzp0JfzGOj/"
                ),
                Server(
                    name = "1Fichier",
                    download = "https://1fichier.com/?ciaq6q5ppy56xmx9xfz5"
                )
            )
        )
        val result = runBlocking { Anvflix.getEpisodes(anime = "Kamierabi", episode = 1) }

        if (result != null) {
            assertEquals(episode.title, result.title)
            assertEquals(episode.number, result.number)
            assertEquals(episode.servers, result.servers)
        }
    }

    companion object {
        @BeforeAll
        @JvmStatic
        internal fun setup() {
            Anvflix
        }
    }
}