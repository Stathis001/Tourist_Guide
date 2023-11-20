package com.example.touristguide;

import android.content.DialogInterface;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;

public class MarkerLoader {
    public MarkerLoader(GoogleMap map) {
        MarkerManager manager = new MarkerManager(map);
        manager.addMarker(1, 41.07529662776701, 23.55353525970813,"dipae");
        //we need to add all the markers somehow here.HELP!!!!
        manager.addMarker(2, 41.09835129725971, 23.551927608268336,"Lofos Koyla");
        manager.addMarker(3, 41.09156654135183, 23.559917963233605,"Achmet Pasa Tzami");
        manager.addMarker(4, 41.08828964518851, 23.553439602363994,"Ζιντζιρλί Τζαμί");
        manager.addMarker(5, 41.09146333054632, 23.55051494660206,"Liberty Square");
        manager.addMarker(6, 41.090984162331786, 23.54966866588395,"Archeological Museum of Serres (Bezesteni)");
        manager.addMarker(7, 41.10059767457084, 23.57097613512557,"Natural History Museum");
        manager.addMarker(8, 41.10434890738389, 23.553423758489348,"Agioi Anargyroi Valley");
    }
}
