package com.example.googlemap.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ParkingSp")
data class ParkingSpotEntity(
    @PrimaryKey val id: Int? = null,
    val lat: Double,
    val lng: Double
)