package com.example.touristguide;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;

public class MarkerManager {

    private GoogleMap googleMap;
    private HashMap<String, Marker> markerMap;

    public MarkerManager(GoogleMap googleMap) {
        this.googleMap = googleMap;
        this.markerMap = new HashMap<>();
    }

    public void addMarker(String markerId, double latitude, double longitude) {
        LatLng location = new LatLng(latitude, longitude);
        // Check if the marker with the given ID already exists
        if (markerMap.containsKey(markerId)) {
            // If it exists, update its position and title
            Marker existingMarker = markerMap.get(markerId);
            existingMarker.setPosition(location);
        } else {
            // If it doesn't exist, create a new marker
            MarkerOptions markerOptions = new MarkerOptions().position(location);
            Marker newMarker = googleMap.addMarker(markerOptions);
            markerMap.put(markerId, newMarker);
        }
    }

    public void removeMarker(String markerId) {
        // Check if the marker with the given ID exists
        if (markerMap.containsKey(markerId)) {
            // If it exists, remove it from the map and the HashMap
            Marker markerToRemove = markerMap.get(markerId);
            markerToRemove.remove();
            markerMap.remove(markerId);
        }
    }



    // You can add more methods for customization or additional functionality as needed
}