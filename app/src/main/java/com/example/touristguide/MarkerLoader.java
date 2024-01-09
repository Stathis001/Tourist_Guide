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
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.092479913425834, 23.548556365564238)).title(getString(R.string.anastasios_eskitzis_reumatologos)).snippet("Ίατρικό Κέντρο ΙΑΣΙΣ (τηλ. 6946420084")));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09034269429762, 23.55348399478657)).title(getString(R.string.maria_kokarida_wrila)).snippet("Χειρουργός Ωτορινολαρυγγολόγος  (τηλ. 2321021021)");
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08731152657037, 23.55017293627774)).title(getString(R.string.orthopaidiko_iatreio_enilikwn_kai_paidwn)).snippet("Βασίλειος Γεωργίου, Χειρουργός ορθοπεδικός (τηλ. 2321023700"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07529662776701, 23.55353525970813)).title(getString(R.string.dipae)).snippet("Δημόσιο Πανεπιστήμιο (τηλ. 2321049101)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09835129725971, 23.551927608268336)).title(getString(R.string.lofos_koyla)).snippet("Ιστορικό Αξιοθέατο"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09156654135183, 23.559917963233605)).title(getString(R.string.achmet_pasa_tzami)).snippet("Ιστορικό αξιοθέατο"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08828964518851, 23.553439602363994)).title(getString(R.string.Zilingiri_Tzami)).snippet("Ιστορικό αξιοθέατο"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09146333054632, 23.55051494660206)).title(getString(R.string.liberty_square)).snippet("Τουριστικό αξιοθέατο"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.090984162331786, 23.54966866588395)).title(getString(R.string.archeological_museum_of_serres_bezesteni)).snippet("Μουσείο (τηλ. 2321022257)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10059767457084, 23.57097613512557)).title(getString(R.string.natural_history_museum)).snippet("Μουσείο (τηλ. 2321099395)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10434890738389, 23.553423758489348)).title(getString(R.string.agioi_anargyroi_valley)).snippet("Πάρκο"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07791797232521, 23.542626119426355)).title(getString(R.string.intercity_bus_station_of_serres)).snippet("Εταιρεία λεωφορείων"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07329171632362, 23.5470893150212)).title(getString(R.string.serres_camp)).snippet("Σχολείο"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09486734480665, 23.558418965379346)).title(getString(R.string.philippos_xenia_hotel_hotel)).snippet("Ξενοδοχείο 4 αστέρων (τηλ. 2321099360)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10347193488058, 23.549222483272818)).title(getString(R.string.elpida_resort_spa_hotel)).snippet("Ξενοδοχείο 4 αστέρων (τηλ. 2321020000)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08930648512539, 23.527421488950267)).title(getString(R.string.serres_national_stadium)).snippet("Στάδιο (τηλ. 2321050819)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09293009514462, 23.55736205023394)).title(getString(R.string.serres_state_health_center)).snippet("Ιατρικό Κέντρο (τηλ. 2321065493)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.0941120281705, 23.546161726125494)).title(getString(R.string.kalithea_serres)).snippet("Τουριστικό Αξιοθέατο"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.097588736734345, 23.551225736764437)).title(getString(R.string.city_wine_bar_restaurant)).snippet("Μπαρ με κρασί"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.082807410884556, 23.5425353795879)).title(getString(R.string.fire_service_emergency_services)).snippet("Σταθμός Πυροσβεστικής (τηλ. 2321098910)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07275655544222, 23.51766362781244)).title(getString(R.string.serres_racing_circuit)).snippet("Πίστα αγώνων αυτοκινήτου (τηλ. 2321052592)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.06602011402373, 23.54131497674441)).title(getString(R.string.la_vita_center)).snippet("Μπόουλινγκ (τηλ. 2321039606)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.084803498471516, 23.546518769143844)).title(getString(R.string.serres_municipal_stadium)).snippet("Γήπεδο ποδοσφαίρου"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08315378520309, 23.551668610294023)).title(getString(R.string.ellhnwn_geuseis)).snippet("Ελληνικό εστιατόριο (τηλ. 2321098808)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08084088215488, 23.541583504790097)).title(getString(R.string.bruno_coffee_stores)).snippet("Καφετέρια (τηλ. 2321022199)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08787638344969, 23.541433300952594)).title(getString(R.string.acs_courier)).snippet("Υπηρεσία courier (τηλ.2321050889)"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.090423204868415, 23.58244886315631)).title(getString(R.string.general_hospital_of_serres)).snippet("Νοσοκομείο"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09137601208604, 23.503011834688117)).title(getString(R.string.ergostasio_zaharhs)).snippet(""));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.14501059108502, 23.56798662373499)).title(getString(R.string.eleonas_waterfall)).snippet("Περιοχή πεζοπορίας"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08450712812035, 23.58830568688104)).title(getString(R.string.aerodromio)).snippet("Διάδρομος προσγείωσης"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10935603117662, 23.488498349170314)).title(getString(R.string.joy_dog_club)).snippet("Φύλαξη κατοικιδίων"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.085807177397065, 23.497308472294627)).title(getString(R.string.hobbytech_track)).snippet("Πίστα αγώνων αυτοκινήτου\n"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.097390282594645, 23.545074746638075)).title(getString(R.string.byzantino_ydragwgeio)).snippet("Πηγή"));
        allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10368066471727, 23.55034040268912)).title(getString(R.string.therini_cinema)).snippet("Κινηματογράφος (τηλ. 2321052430)"));
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
