package hu.bme.aut.pawpals.network.model

import hu.bme.aut.pawpals.network.model.WalkDetails

data class Walk (
    val status: kotlin.String? = null,
    val code: kotlin.Int? = null,
    val total: kotlin.Int? = null,
    val data: kotlin.Array<WalkDetails>? = null,
){

}