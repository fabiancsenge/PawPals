package hu.bme.aut.pawpals.persistence

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Walk(
    @PrimaryKey val id: Int,
    val dogImageUrl: String,
    val dogName: String,
    val meetingPoint: String,
    val date: String,
    val time: String,
    val walkLength: String,
    val ownerName: String,
    val phone: String
)