package com.example.touristguide;

import android.content.DialogInterface;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;

public class MarkerLoader {
    public MarkerLoader(GoogleMap map) {
        MarkerManager manager = new MarkerManager(map);
        map.addMarker(new MarkerOptions().position(new LatLng(41.092479913425834, 23.548556365564238)).title("Anastasios eskitzis- Reumatologos").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.09034269429762, 23.55348399478657)).title("Maria Kokarida - Wrila").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.08731152657037, 23.55017293627774)).title("Orthopaidiko iatreio enilikwn kai paidwn").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.08731152657037, 23.55017293627774)).title("Orthopaidiko iatreio enilikwn kai paidwn").snippet("This is marker 1's snippet"));
    }
}
