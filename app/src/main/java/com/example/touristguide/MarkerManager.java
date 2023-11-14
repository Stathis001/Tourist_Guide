package com.example.touristguide;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MarkerManager {

    private GoogleMap googleMap;

    public MarkerManager(GoogleMap googleMap) {
        this.googleMap = googleMap;
    }

    public void addMarker(double latitude, double longitude, String title) {
        LatLng location = new LatLng(latitude, longitude);
        MarkerOptions markerOptions = new MarkerOptions().position(location).title(title);
        googleMap.addMarker(markerOptions);
    }


}