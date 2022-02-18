package tech.henriquedev.unidade03.models

import com.squareup.moshi.Json

data class RepositoryItem(
    @Json(name = "name") val name: String,
    @Json(name = "html_url") val url: String,
    @Json(name = "description") val description: String?,
    @Json(name = "owner") val owner: Owner
)
