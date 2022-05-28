package com.example.googlemap.data

import com.example.googlemap.domain.ParkingSpot
import com.example.googlemap.repository.ParkingSpotRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ParkingSpotRepImpl(
    private val dao: ParkingSpotDao
) : ParkingSpotRepository {
    override suspend fun insertParkingSpot(spot: ParkingSpot) {
        dao.insertSpot(spot.toParkingSpotEntity())
    }

    override suspend fun deleteParking(spot: ParkingSpot) {
        dao.deleteSpot(spot.toParkingSpotEntity())
    }

    override fun getParkingSpots(): Flow<List<ParkingSpot>> {
        return dao.getParkingSpots().map { spots ->
            spots.map { it.toParkingSpot() }
        }
    }
}