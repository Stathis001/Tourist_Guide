package com.example.touristguide;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

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
    private MarkerLoader markerLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SupportMapFragment mapFragment = new SupportMapFragment();
        fragmentTransaction.add(R.id.mapFragment, mapFragment);
        fragmentTransaction.commit();

        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap map) {
                googleMap = map;
                markerLoader = new MarkerLoader(map);
                locationHandler = new LocationHandler(MapsActivity.this,map, fusedLocationClient);
                locationHandler.initializeLocation();
            }
        });
        fusedLocationClient = new FusedLocationProviderClient(this);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (locationHandler != null) {
            locationHandler.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    public void showPopup(View filter) {
        PopupMenu popup = new PopupMenu(this, filter);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_filters_menu);
        popup.show();
    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {

        int id = item.getItemId();
        if (id==R.id.item1){
            Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item2) {
            Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item3) {
            Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item4) {
            Toast.makeText(this, "Item 4 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item5) {
            Toast.makeText(this, "Item 5 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item6) {
            Toast.makeText(this, "Item 6 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item7) {
            Toast.makeText(this, "Item 7 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item8) {
            Toast.makeText(this, "Item 8 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item9) {
            Toast.makeText(this, "Item 9 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item10) {
            Toast.makeText(this, "Item 10 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item11) {
            Toast.makeText(this, "Item 11 clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            return false;
        }
    }

}
