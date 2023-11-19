package com.example.touristguide;


import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.Context;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class SimpleMapHandler extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap googleMap;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity_main);

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
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;
        LatLng defaultLocation = new LatLng(41.0863158468594, 23.54805430548399); // Serres
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(defaultLocation));
    }
}