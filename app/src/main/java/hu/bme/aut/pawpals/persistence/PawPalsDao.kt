package hu.bme.aut.pawpals.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import dagger.Provides
import javax.inject.Singleton

@Dao
interface PawPalsDao {
    @Query("SELECT * FROM walk")
    fun getAll(): List<Walk>

    @Insert
    fun insertAll(vararg quotes: Walk)

    @Query("DELETE FROM walk")
    fun deleteAll()
}