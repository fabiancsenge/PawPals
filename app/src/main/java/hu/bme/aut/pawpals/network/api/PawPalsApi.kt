package hu.bme.aut.pawpals.network.api

import hu.bme.aut.pawpals.network.model.Walk
import hu.bme.aut.pawpals.network.model.Image
import retrofit2.Response
import retrofit2.http.GET

interface PawPalsApi {

    @GET("/breeds/image/random")
    suspend fun handleQueryDogImage() : Response<Image>

    @GET("/custom")
    suspend fun handleQueryWalk() : Response<Walk>
}