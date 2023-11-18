package com.example.touristguide;

import com.google.android.gms.maps.GoogleMap;

public class MarkerLoader {
    public MarkerLoader(GoogleMap map) {
        MarkerManager manager = new MarkerManager(map);
        manager.addMarker("ΔΙΠΑΕ ΣΕΡΡΩΝ", 41.07529662776701, 23.55353525970813);
    }
}
