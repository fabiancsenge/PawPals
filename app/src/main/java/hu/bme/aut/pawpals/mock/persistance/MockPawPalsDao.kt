package hu.bme.aut.pawpals.mock.persistance

import hu.bme.aut.pawpals.persistence.PawPalsDao
import hu.bme.aut.pawpals.persistence.Walk

class MockPawPalsDao: PawPalsDao {
    override fun getAll(): List<Walk> {
        TODO("Not yet implemented")
    }

    override fun insertAll(vararg walk: Walk) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}