package files

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File

@Serializable
data class Country(
    val name: Name,
    val capital: List<String>,
    val area: Double,
    val region: String? = null
)

@Serializable
data class Name(val common: String)

@Serializable
data class CountryDto(
    val name: String,
    val capital: String,
    val area: Double
)

fun Country.toDto() = CountryDto(
    name = this.name.common,
    capital = this.capital.firstOrNull() ?: "",
    area = this.area
)

fun main() {
    val json = Json { ignoreUnknownKeys = true }

    val countriesJsonString = File("src/main/resources/countries.json").readText()
    val countries = json.decodeFromString<List<Country>>(countriesJsonString)

    val result = countries
//        .filter { it.region == "Africa" }
        .sortedByDescending { it.area }
        .take(10)
        .map { it.toDto() }
        .let { json.encodeToString(it) }

    println(result)
}

