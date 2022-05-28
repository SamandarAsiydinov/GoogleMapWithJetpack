package com.example.googlemap.di

import android.app.Application
import androidx.room.Room
import com.example.googlemap.data.ParkingSpotDatabase
import com.example.googlemap.data.ParkingSpotRepImpl
import com.example.googlemap.repository.ParkingSpotRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app: Application): ParkingSpotDatabase {
        return Room.databaseBuilder(
            app.applicationContext,
            ParkingSpotDatabase::class.java,
            "parking_spot.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideParkingSpotRepository(db: ParkingSpotDatabase): ParkingSpotRepository {
        return ParkingSpotRepImpl(db.spotDao())
    }
}