package com.example.googlemap.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ParkingSpotDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSpot(sport: ParkingSpotEntity)

    @Delete
    suspend fun deleteSpot(sport: ParkingSpotEntity)

    @Query("SELECT * FROM ParkingSp")
    fun getParkingSpots(): Flow<List<ParkingSpotEntity>>

}