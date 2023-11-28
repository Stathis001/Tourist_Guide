package com.example.touristguide;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

public class LocationHandler extends FragmentActivity {
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    private  FragmentActivity activity;
    private Location location;
    private LatLng currentUserLocation;
    private  GoogleMap googleMap;
    private  FusedLocationProviderClient fusedLocationClient;

    public LocationHandler(FragmentActivity activity, GoogleMap googleMap, FusedLocationProviderClient fusedLocationClient) {
        this.activity = activity;
        this.googleMap = googleMap;
        this.fusedLocationClient = fusedLocationClient;
    }

    public void initializeLocation() {
        // Initialize location services here
        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            enableMyLocation();
        } else {
            // Request location permission
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, LOCATION_PERMISSION_REQUEST_CODE);
        }
    }

    private void enableMyLocation() {
        // Enable location functionality here
        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            googleMap.setMyLocationEnabled(true);
            startLocationUpdates();
        }
    }

    public Location startLocationUpdates() {
        // Start location updates here
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setInterval(5000); // Update every 5 seconds
        locationRequest.setFastestInterval(3000); // Fastest update interval
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // Handle the case where permissions are not granted
        }

        fusedLocationClient.requestLocationUpdates(locationRequest, new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                super.onLocationResult(locationResult);
                if (locationResult.getLastLocation() != null) {
                    location = locationResult.getLastLocation();
                    currentUserLocation = new LatLng(location.getLatitude(), location.getLongitude());
                }
            }
        }, null);

        return location;
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                enableMyLocation();
            } else {
                // Permission denied
                startSimpleMapHandlerActivity();
            }
        }
    }
    public LatLng getCurrentUserLocation() {
        return currentUserLocation;
    }

    private void startSimpleMapHandlerActivity() {
        Intent intent = new Intent(this, SimpleMapHandler.class);
        startActivity(intent);
    }
}