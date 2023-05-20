package hu.bme.aut.pawpals.mock.network

import hu.bme.aut.pawpals.network.api.PawPalsApi
import hu.bme.aut.pawpals.network.model.Image
import hu.bme.aut.pawpals.network.model.Walk
import hu.bme.aut.pawpals.network.model.WalkDetails
import retrofit2.Response

class MockApi: PawPalsApi{
    override suspend fun handleQueryDogImage(): Response<Image> {
        val image = Image(
            dogImageUrl = "https:\\/\\/images.dog.ceo\\/breeds\\/finnish-lapphund\\/mochilamvan.jpg",
        )
        return Response.success(image)
    }

    override suspend fun handleQueryWalk(): Response<Walk> {
        val walkDetails = WalkDetails(
            name = "Bence Fülöp",
            phone = "+3838546804336",
            city = "Budapest",
            street = "Dobos lakótelep",
            building = "9",
            dogname = "Mankey"
        )
        var wds: Array<WalkDetails> = emptyArray()
        wds += walkDetails
        val walk = Walk(
            status = "OK",
            code = 200,
            total = 1,
            data = wds
        )
        return Response.success(walk)
    }
}