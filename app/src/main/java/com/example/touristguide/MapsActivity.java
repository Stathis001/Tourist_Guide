package com.example.touristguide;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class MapsActivity extends FragmentActivity {

    private GoogleMap googleMap;
    private FusedLocationProviderClient fusedLocationClient;
    private LocationHandler locationHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the SupportMapFragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SupportMapFragment mapFragment = new SupportMapFragment();
        fragmentTransaction.add(R.id.mapFragment, mapFragment);
        fragmentTransaction.commit();
        // Set up the Google Map
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override

            public void onMapReady(GoogleMap map) {
                googleMap = map;

                // Instantiate LocationHandler
                locationHandler = new LocationHandler(MapsActivity.this, googleMap, fusedLocationClient);

                // Initialize location
                locationHandler.initializeLocation();
            }
        });
        fusedLocationClient = new FusedLocationProviderClient(this);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        // Forward the result to LocationHandler
        if (locationHandler != null) {
            locationHandler.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
            public void onMapReady(GoogleMap googleMap) {
                // You can customize the map and add markers, etc., here.
            }
        }
    }
}
