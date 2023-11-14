package com.example.touristguide;

import android.content.Context;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class SimpleMapHandler implements OnMapReadyCallback {

    private GoogleMap googleMap;
    private Context context;

    public void MapHandler(Context context) {
        this.context = context;
    }

    public void createMap(FragmentActivity activity, int mapContainerId) {
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        SupportMapFragment mapFragment = (SupportMapFragment) fragmentManager.findFragmentByTag("mapFragment");

        if (mapFragment == null) {
            mapFragment = SupportMapFragment.newInstance();
            fragmentManager.beginTransaction()
                    .replace(mapContainerId, mapFragment, "main_activity")
                    .commit();
        }

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;
        // Customize map settings if needed
        // e.g., googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        // Add a marker in a default location and move the camera
        LatLng defaultLocation = new LatLng(0, 0);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(defaultLocation));
    }
}