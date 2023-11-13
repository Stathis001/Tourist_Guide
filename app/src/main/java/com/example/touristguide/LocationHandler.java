package com.example.touristguide;

<<<<<<< HEAD
import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.GoogleMap;


>>>>>>> origin/Marios
public class LocationHandler {
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;

    private  FragmentActivity activity;
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
    private void startLocationUpdates() {
        // Start location updates here
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setInterval(5000); // Update every 5 seconds
        locationRequest.setFastestInterval(3000); // Fastest update interval
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            return;
        }

        fusedLocationClient.requestLocationUpdates(locationRequest, new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                super.onLocationResult(locationResult);
                if (locationResult.getLastLocation() != null) {
                    Location location = locationResult.getLastLocation();
                    // You can use the 'location' object to get the latitude and longitude
                }
            }
        }, null);
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        // Handle permission results here
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                enableMyLocation();
            } else {
                // Handle permission denied
                //The map works with the sites and every thing but can't provide directions and gps location of user.
                //This is a whole new class that needs to set these things up.
            }
        }
    }
    public
}
