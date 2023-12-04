package com.example.touristguide;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.HashMap;


public class MarkerManager {

    private GoogleMap googleMap;
    private HashMap<Integer, MapMarker> mapMarkers;

    public MarkerManager(GoogleMap googleMap) {
        this.googleMap = googleMap;
        this.mapMarkers = new HashMap<>();
    }

    public void addMarker(int markerId, double latitude, double longitude, String name) {
        LatLng location = new LatLng(latitude, longitude);
        MapMarker existingMapMarker = mapMarkers.get(markerId);
        existingMapMarker.setPosition(location);
        if (mapMarkers.containsKey(markerId)) {
            existingMapMarker.setPosition(location);
        } else {
            MarkerOptions markerOptions = new MarkerOptions().position(location);
            googleMap.addMarker(markerOptions);
            googleMap.setOnMarkerClickListener(existingMapMarker);
            mapMarkers.put(markerId, existingMapMarker);
        }
    }

    public void removeMarker(int markerId) {
        if (mapMarkers.containsKey(markerId)) {
            MapMarker mapMarker = mapMarkers.get(markerId);
            mapMarker.remove();
            mapMarkers.remove(markerId);
        }
    }
}
