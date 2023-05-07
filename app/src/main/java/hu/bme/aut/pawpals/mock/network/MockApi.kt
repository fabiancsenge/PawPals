package hu.bme.aut.pawpals.mock.network

import hu.bme.aut.pawpals.network.api.PawPalsApi
import hu.bme.aut.pawpals.network.model.Walk
import hu.bme.aut.pawpals.network.model.Image
import retrofit2.Response

class MockApi: PawPalsApi{
    override suspend fun handleQueryDogImage(): Response<Image> {
        TODO("Not yet implemented")
    }

    override suspend fun handleQueryWalk(): Response<Walk> {
        TODO("Not yet implemented")
    }
}