package com.example.touristguide;

import android.content.DialogInterface;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class MarkerLoader implements GoogleMap.OnMarkerClickListener {
    private Marker clickedMarker;
    private List<Marker> allMarkers;

    public MarkerLoader(GoogleMap map) {
        MarkerManager manager = new MarkerManager(map);
        allMarkers = new ArrayList<>();
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07529662776701, 23.55353525970813)).title("dipae").snippet("This is marker 1's snippet").contentDescription("some description")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09835129725971, 23.551927608268336)).title("Lofos Koyla").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09156654135183, 23.559917963233605)).title("Achmet Pasa Tzami").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08828964518851, 23.553439602363994)).title("Ζιντζιρλί Τζαμί").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09146333054632, 23.55051494660206)).title("Liberty Square").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.090984162331786, 23.54966866588395)).title("Archeological Museum of Serres (Bezesteni)").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10059767457084, 23.57097613512557)).title("Natural History Museum").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10434890738389, 23.553423758489348)).title("Agioi Anargyroi Valley").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07791797232521, 23.542626119426355)).title("Intercity Bus Station of Serres").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07329171632362, 23.5470893150212)).title("Serres Camp").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09486734480665, 23.558418965379346)).title("Philippos Xenia Hotel").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10347193488058, 23.549222483272818)).title("Elpida Resort & Spa").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08930648512539, 23.527421488950267)).title("Serres National Stadium").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09293009514462, 23.55736205023394)).title("Serres State Health Center").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.0941120281705, 23.546161726125494)).title("Kalithea Serres").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.097588736734345, 23.551225736764437)).title("Cityζεν WINE · BAR · RESTAURANT").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.082807410884556, 23.5425353795879)).title("Fire Service").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07275655544222, 23.51766362781244)).title("Serres Racing Circuit").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.06602011402373, 23.54131497674441)).title("LA VITA CENTER").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.084803498471516, 23.546518769143844)).title("Serres Municipal Stadium").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08315378520309, 23.551668610294023)).title("Ελλήνων Γεύσεις").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08084088215488, 23.541583504790097)).title("Bruno Coffee Stores").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08787638344969, 23.541433300952594)).title("ACS Courier").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.090423204868415, 23.58244886315631)).title("General Hospital of Serres").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.092479913425834, 23.548556365564238)).title("Anastasios eskitzis- Reumatologos").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09034269429762, 23.55348399478657)).title("Maria Kokarida - Wrila").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08731152657037, 23.55017293627774)).title("Orthopaidiko iatreio enilikwn kai paidwn").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08731152657037, 23.55017293627774)).title("Orthopaidiko iatreio enilikwn kai paidwn").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07529662776701, 23.55353525970813)).title("dipae").snippet("This is marker 1's snippet").contentDescription("some description")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09835129725971, 23.551927608268336)).title("Lofos Koyla").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09156654135183, 23.559917963233605)).title("Achmet Pasa Tzami").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08828964518851, 23.553439602363994)).title("Ζιντζιρλί Τζαμί").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09146333054632, 23.55051494660206)).title("Liberty Square").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.090984162331786, 23.54966866588395)).title("Archeological Museum of Serres (Bezesteni)").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10059767457084, 23.57097613512557)).title("Natural History Museum").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10434890738389, 23.553423758489348)).title("Agioi Anargyroi Valley").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07791797232521, 23.542626119426355)).title("Intercity Bus Station of Serres").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07329171632362, 23.5470893150212)).title("Serres Camp").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09486734480665, 23.558418965379346)).title("Philippos Xenia Hotel").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10347193488058, 23.549222483272818)).title("Elpida Resort & Spa").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08930648512539, 23.527421488950267)).title("Serres National Stadium").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09293009514462, 23.55736205023394)).title("Serres State Health Center").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.0941120281705, 23.546161726125494)).title("Kalithea Serres").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.097588736734345, 23.551225736764437)).title("Cityζεν WINE · BAR · RESTAURANT").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.082807410884556, 23.5425353795879)).title("Fire Service").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07275655544222, 23.51766362781244)).title("Serres Racing Circuit").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.06602011402373, 23.54131497674441)).title("LA VITA CENTER").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.084803498471516, 23.546518769143844)).title("Serres Municipal Stadium").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08315378520309, 23.551668610294023)).title("Ελλήνων Γεύσεις").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08084088215488, 23.541583504790097)).title("Bruno Coffee Stores").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08787638344969, 23.541433300952594)).title("ACS Courier").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.090423204868415, 23.58244886315631)).title("General Hospital of Serres").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09137601208604, 23.503011834688117)).title("Εργοστάσιο Ζάχαρης ΕΒΖ").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.14501059108502, 23.56798662373499)).title("Καταρράκτες του Ελαιώνας Eleonas Waterfall").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09299314426827,23.515231717565964)).title("Lidl").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.05052488942454, 23.53291159053017)).title("AUTOGAS SERRES").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.04257774991801, 23.52753457401081)).title("Shell").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08450712812035, 23.58830568688104)).title("Αεροδρόμιο «Εμμανουήλ Παππάς»").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09094591627225, 23.600749255344375)).title("Bodyfit Σέρρες - Γυμναστήρια Σέρρες").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10935603117662, 23.488498349170314)).title("Joy Dog Club Ξενοδοχείο Σκύλων").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.0983612703665,23.47249092575993)).title("JUMBO").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.084980140470996, 23.502080266589516)).title("washer truck").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.085807177397065, 23.497308472294627)).title("Hobbytech Track-Πίστα").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.097390282594645, 23.545074746638075)).title("Βυζαντινό Υδραγωγείο Σερρών").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10109319034786, 23.551876828708686)).title("Κολυμβητήριο").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09632970832197, 23.564652464585212)).title("Σνούπυ Academy | Κέντρο προσχολικής αγωγής").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09657008557742, 23.565883689570832)).title("ΚΩΣΤΟΠΟΥΛΕΙΟΣ ΣΤΕΓΗ Μονάδα Χρονίων Παθήσεων").snippet("This is marker 1's snippet")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10368066471727, 23.55034040268912)).title("Θερινό Σινεμά").snippet("This is marker 1's snippet")));
        map.setOnMarkerClickListener(this);
    }


    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        clickedMarker=marker;
        return false;
    }
    public void filterMarkers(List<String> keywords) {
        for (Marker marker : allMarkers) {
            // Check if the marker title contains the keyword
            boolean shouldShowMarker = false;
            for (String keyword : keywords) {
                if (marker.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                    // Show the marker
                    shouldShowMarker = true;
                    break;
                }
            }
            //set visibility of the marker
            marker.setVisible(shouldShowMarker);
        }
    }
    public Marker getClickedMarker() {
        return clickedMarker;

    }
}
