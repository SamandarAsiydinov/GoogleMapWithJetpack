package com.example.googlemap.repository

import com.example.googlemap.domain.ParkingSpot
import kotlinx.coroutines.flow.Flow

interface ParkingSpotRepository {

    suspend fun insertParkingSpot(spot: ParkingSpot)

    suspend fun deleteParking(spot: ParkingSpot)

    fun getParkingSpots(): Flow<List<ParkingSpot>>
}