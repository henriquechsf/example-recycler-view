package tech.henriquedev.unidade03.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import tech.henriquedev.unidade03.models.Repository

interface GitApi {
    //https://api.github.com/ search/repositories?q=language:Kotlin

    @GET(value = "search/repositories")
    fun getRepositories(@Query("q") language: String): Call<Repository>
}