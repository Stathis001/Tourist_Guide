package com.example.touristguide;

import android.content.DialogInterface;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;

public class MarkerLoader {
    public MarkerLoader(GoogleMap map) {
        MarkerManager manager = new MarkerManager(map);
        manager.addMarker(1, 41.07529662776701, 23.55353525970813,"dipae");
        //we need to add all the markers somehow here.HELP!!!!
    }
}
