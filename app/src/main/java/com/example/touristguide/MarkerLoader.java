package com.example.touristguide;

import android.content.DialogInterface;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MarkerLoader implements GoogleMap.OnMarkerClickListener {
    private Marker clickedMarker;
    public MarkerLoader(GoogleMap map) {
        MarkerManager manager = new MarkerManager(map);
        map.addMarker(new MarkerOptions().position(new LatLng(41.07529662776701, 23.55353525970813)).title("dipae").snippet("This is marker 1's snippet").contentDescription("some description"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.09835129725971, 23.551927608268336)).title("Lofos Koyla").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.09156654135183, 23.559917963233605)).title("Achmet Pasa Tzami").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.08828964518851, 23.553439602363994)).title("Ζιντζιρλί Τζαμί").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.09146333054632, 23.55051494660206)).title("Liberty Square").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.090984162331786, 23.54966866588395)).title("Archeological Museum of Serres (Bezesteni)").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.10059767457084, 23.57097613512557)).title("Natural History Museum").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.10434890738389, 23.553423758489348)).title("Agioi Anargyroi Valley").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.07791797232521, 23.542626119426355)).title("Intercity Bus Station of Serres").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.07329171632362, 23.5470893150212)).title("Serres Camp").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.09486734480665, 23.558418965379346)).title("Philippos Xenia Hotel").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.10347193488058, 23.549222483272818)).title("Elpida Resort & Spa").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.08930648512539, 23.527421488950267)).title("Serres National Stadium").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.09293009514462, 23.55736205023394)).title("Serres State Health Center").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.0941120281705, 23.546161726125494)).title("Kalithea Serres").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.097588736734345, 23.551225736764437)).title("Cityζεν WINE · BAR · RESTAURANT").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.082807410884556, 23.5425353795879)).title("Fire Service").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.07275655544222, 23.51766362781244)).title("Serres Racing Circuit").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.06602011402373, 23.54131497674441)).title("LA VITA CENTER").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.084803498471516, 23.546518769143844)).title("Serres Municipal Stadium").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.08315378520309, 23.551668610294023)).title("Ελλήνων Γεύσεις").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.08084088215488, 23.541583504790097)).title("Bruno Coffee Stores").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.08787638344969, 23.541433300952594)).title("ACS Courier").snippet("This is marker 1's snippet"));
        map.addMarker(new MarkerOptions().position(new LatLng(41.090423204868415, 23.58244886315631)).title("General Hospital of Serres").snippet("This is marker 1's snippet"));
    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        clickedMarker=marker;
        return false;
    }

    public Marker getClickedMarker() {
        return clickedMarker;
    }
}
