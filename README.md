
[![Discord Server](https://img.shields.io/discord/460491088004907029.svg?style=flat&logo=discord)](https://discord.gg/2DZHfxv9XN)  [![](https://jitpack.io/v/jeluchu/anvflix.svg)](https://jitpack.io/#jeluchu/anvflix)

Wrapper for [AnimeFLV API](https://github.com/ahmedrangel/animeflv-api) build using Kotlin + Kotlin DSL + Coroutines power 🚀

# Installation
with Gradle
```groovy  
repositories {   
	maven { url 'https://jitpack.io' }  
}  
  
dependencies {  
	implementation("com.github.jeluchu:anvflix:1.0.0")
}  
```  
# Example
```kotlin  
fun main() {  
	val anime = runBlocking { Anvflix.getAnime("Shigatsu wa Kimi no Uso") } 
	println(anime.title) // Prints: Shigatsu wa Kimi no Uso
}  
```      

# Available requests

- **Search:** Using Anvflix, you can call the request, `getSearch(anime: String)` and after passing it the query from which you want to obtain information it will return a list.

- **Anime:** Using Anvflix, you can call the request, `getAnime(anime: String)` and after passing it the query from which you want to obtain information it will return a object.

- **Episode:** Using Anvflix, you can call the request, `getEpisodes(id: String)` or `getEpisodes(anime: String, episode: Int)` and after passing it the query from which you want to obtain information it will return a list with available servers.

- **Last Episodes:** Using Anvflix, you can call the request, `getLastEpisodes()` and after calling this method, the request will return a list of all recent episodes.

- **Broadcast:** Using Anvflix, you can call the request, `getOnAir()` and after calling this method, the request will return a list of all animes on air.

# Objets

### Search return AnimeSearch object
```kotlin  
data class SearchResultsEntity(
    val cover: String,
    val rating: String,
    val slug: String,
    val synopsis: String,
    val title: String,
    val type: String,
    val url: String
)
```

### Anime return AnimeInfo object
```kotlin  
data class AnimeDataEntity(
    val alternativeTitles: List<String>,
    val cover: String,
    val episodes: List<Episode>,
    val genres: List<String>,
    val rating: String,
    val status: String,
    val synopsis: String,
    val title: String,
    val type: String,
    val url: String
)
```

### Episodes return Server object
```kotlin  
data class EpisodeEntity(
    val number: Int,
    val servers: List<Server>,
    val title: String
)
```

### LastEpisodes return Server object
```kotlin  
data class LastEpisodesEntity(
    val cover: String,
    val number: Int,
    val title: String,
    val url: String
)
```

### On Air return Broadcast object
```kotlin  
data class OnAirEntity(
    val slug: String,
    val title: String,
    val type: String,
    val url: String
)
```

# Acknowledgements
I would like to thank @ahmedrangel who developed the Animeflv API, thank you very much for your work!

# Release
For latest release or to check the changelogs, please check Release tab.

# Contribution
Want to help? I'm very open to contributors so just do it or contact me if you have any question (Discord: jeluchu)