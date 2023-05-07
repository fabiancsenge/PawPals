package hu.bme.aut.pawpals.model

data class Walk(
    val dogImageUrl: String,
    val dogName: String,
    val meetingPoint: String,
    val date: String,
    val time: String,
    val walkLength: String,
    val ownerName: String,
    val phone: String
)