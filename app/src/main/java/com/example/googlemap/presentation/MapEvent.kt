package com.example.googlemap.presentation

import com.example.googlemap.domain.ParkingSpot
import com.google.android.gms.maps.model.LatLng

sealed class MapEvent {
    object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng): MapEvent()
    data class OnInfoWindowLongClick(val spot: ParkingSpot): MapEvent()
}