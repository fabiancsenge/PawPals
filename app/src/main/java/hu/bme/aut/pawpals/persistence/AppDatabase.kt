package hu.bme.aut.pawpals.persistence

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Walk::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun quoteDao(): PawPalsDao
}