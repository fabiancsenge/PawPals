package hu.bme.aut.pawpals.mock.persistance

import hu.bme.aut.pawpals.persistence.PawPalsDao
import hu.bme.aut.pawpals.persistence.Walk

class MockPawPalsDao: PawPalsDao {
    companion object {
        private val  walks = mutableListOf<Walk>()
    }
    override fun getAll(): List<Walk> {
        return walks
    }

    override fun insertAll(vararg walk: Walk) {
        walk.forEach {
            walks.add(it)
        }
    }

    override fun deleteAll() {
        walks.clear()
    }
}