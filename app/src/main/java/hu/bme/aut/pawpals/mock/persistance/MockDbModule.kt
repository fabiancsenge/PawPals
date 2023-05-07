package hu.bme.aut.pawpals.mock.persistance

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import hu.bme.aut.pawpals.persistence.PawPalsDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MockDbModule {

    @Provides
    @Singleton
    fun providesPawPalsDao(): PawPalsDao = MockPawPalsDao()
}