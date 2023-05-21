package hu.bme.aut.pawpals

import hu.bme.aut.pawpals.mock.network.MockApi
import hu.bme.aut.pawpals.mock.persistance.MockPawPalsDao
import hu.bme.aut.pawpals.persistence.Walk
import org.junit.After
import org.junit.*

class TestPawPalsApp {
    private lateinit var daoMock: MockPawPalsDao
    private lateinit var apiMock: MockApi

    @Before
    fun before() {
        daoMock = MockPawPalsDao()
        apiMock = MockApi()
    }

    @After
    fun after() {
        daoMock.deleteAll()
    }

/*
    @Test
    fun TestWalkAddMock() {
        val w = Walk(1000, "https:\\/\\/images.dog.ceo\\/breeds\\/finnish-lapphund\\/mochilamvan.jpg", "Mankey", "Budapest, Dobos lakótelep 9", "2023-05-22", "18:00", "5.3", "Bence Fülöp", "+3838546804336")
        daoMock.insertAll(w)
        val list = daoMock.getAll()
        assert(list.size == 1)
        assert(list[0] == w)
    }

    @Test
    fun TestWalkDeleteAllMock() {
        val w = Walk(1000, "https:\\/\\/images.dog.ceo\\/breeds\\/finnish-lapphund\\/mochilamvan.jpg", "Mankey", "Budapest, Dobos lakótelep 9", "2023-05-22", "18:00", "5.3", "Bence Fülöp", "+3838546804336")
        daoMock.insertAll(w)
        var list = daoMock.getAll()
        assert(list.size == 1)
        assert(list[0] == w)
        daoMock.deleteAll()
        list = daoMock.getAll()
        assert(list.size == 0)
    }
*/
}