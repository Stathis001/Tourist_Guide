package com.example.touristguide;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends AppCompatActivity {
    private LocationHandler locationHandler;
    private FusedLocationProviderClient fusedLocationClient;
    private List<Marker> allMarkers = new ArrayList<>();
    private DirectionsHandler directionsHandler;
    private GoogleMap googleMap;
    private PlacesClient placesClient;
    private Button clearButton;
    private Spinner filterSpinner;
    Button filtersButton;
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
            @SuppressLint("PotentialBehaviorOverride")
            @Override
            public void onMapReady(GoogleMap map) {
                googleMap = map;
                addMarkersToMap(map);
                fusedLocationClient = LocationServices.getFusedLocationProviderClient(MapsActivity.this);
                locationHandler = new LocationHandler(MapsActivity.this, map, fusedLocationClient);
                locationHandler.initializeLocation();
                Places.initialize(getApplicationContext(), String.valueOf(R.string.google_maps_key)); // Replace with your API key
                placesClient = Places.createClient(MapsActivity.this);
                View buttonView = getLayoutInflater().inflate(R.layout.map_activity_main, null);
                filtersButton = buttonView.findViewById(R.id.filterButton);
                filtersButton.setOnClickListener(v -> {
                    View spinnerView = getLayoutInflater().inflate(R.layout.filter_menu,null);
                    filterSpinner = spinnerView.findViewById(R.id.filterSpinner);
                    List<String> filterOptions = getFilterOptions(); // Define this method to get your filter options
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MapsActivity.this, android.R.layout.simple_spinner_item, filterOptions);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    filterSpinner.setAdapter(adapter);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    filterSpinner.setAdapter(adapter);

                    // Set a listener for Spinner item selection
                    filterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                            String selectedFilter = (String) parentView.getItemAtPosition(position);
                            // Handle the selected filter, e.g., start a new map with filtered markers
                            //Αυτό που λέει από πάνω.
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parentView) {
                            // Do nothing
                        }

                    });
                }); // This brace was moved up
            } // This brace was moved down
        }); // This brace was added
    }

        private List<String> getFilterOptions() {
        // Define your filter options here (e.g., retrieve from a database, static list, etc.)
        List<String> filters = new ArrayList<>();
        filters.add("Filter Option 1");
        filters.add("Filter Option 2");
        filters.add("Filter Option 1");
        filters.add("Filter Option 2");
        filters.add("Filter Option 1");
        filters.add("Filter Option 2");
        filters.add("Filter Option 1");
        filters.add("Filter Option 2");
        // Add more filter options as needed
        return filters;
    }
    @SuppressLint("PotentialBehaviorOverride")
            private void addMarkersToMap(GoogleMap map) {
                // Add your markers as before
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.092479913425834, 23.548556365564238)).title(getString(R.string.anastasios_eskitzis_reumatologos)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09034269429762, 23.55348399478657)).title(getString(R.string.maria_kokarida_wrila)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08731152657037, 23.55017293627774)).title(getString(R.string.orthopaidiko_iatreio_enilikwn_kai_paidwn)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07529662776701, 23.55353525970813)).title(getString(R.string.dipae)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09835129725971, 23.551927608268336)).title(getString(R.string.lofos_koyla)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09156654135183, 23.559917963233605)).title(getString(R.string.achmet_pasa_tzami)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08828964518851, 23.553439602363994)).title(getString(R.string.Zilingiri_Tzami)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09146333054632, 23.55051494660206)).title(getString(R.string.liberty_square)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.090984162331786, 23.54966866588395)).title(getString(R.string.archeological_museum_of_serres_bezesteni)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10059767457084, 23.57097613512557)).title(getString(R.string.natural_history_museum)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10434890738389, 23.553423758489348)).title(getString(R.string.agioi_anargyroi_valley)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07791797232521, 23.542626119426355)).title(getString(R.string.intercity_bus_station_of_serres)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07329171632362, 23.5470893150212)).title(getString(R.string.serres_camp)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09486734480665, 23.558418965379346)).title(getString(R.string.philippos_xenia_hotel_hotel)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10347193488058, 23.549222483272818)).title(getString(R.string.elpida_resort_spa_hotel)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08930648512539, 23.527421488950267)).title(getString(R.string.serres_national_stadium)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09293009514462, 23.55736205023394)).title(getString(R.string.serres_state_health_center)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.0941120281705, 23.546161726125494)).title(getString(R.string.kalithea_serres)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.097588736734345, 23.551225736764437)).title(getString(R.string.city_wine_bar_restaurant)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.082807410884556, 23.5425353795879)).title(getString(R.string.fire_service_emergency_services)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.07275655544222, 23.51766362781244)).title(getString(R.string.serres_racing_circuit)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.06602011402373, 23.54131497674441)).title(getString(R.string.la_vita_center)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.084803498471516, 23.546518769143844)).title(getString(R.string.serres_municipal_stadium)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08315378520309, 23.551668610294023)).title(getString(R.string.ellhnwn_geuseis)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08084088215488, 23.541583504790097)).title(getString(R.string.bruno_coffee_stores)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08787638344969, 23.541433300952594)).title(getString(R.string.acs_courier)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.090423204868415, 23.58244886315631)).title(getString(R.string.general_hospital_of_serres)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.09137601208604, 23.503011834688117)).title(getString(R.string.ergostasio_zaharhs)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.14501059108502, 23.56798662373499)).title(getString(R.string.eleonas_waterfall)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.08450712812035, 23.58830568688104)).title(getString(R.string.aerodromio)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10935603117662, 23.488498349170314)).title(getString(R.string.joy_dog_club)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.085807177397065, 23.497308472294627)).title(getString(R.string.hobbytech_track)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.097390282594645, 23.545074746638075)).title(getString(R.string.byzantino_ydragwgeio)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
                allMarkers.add(map.addMarker(new MarkerOptions().position(new LatLng(41.10368066471727, 23.55034040268912)).title(getString(R.string.therini_cinema)).snippet(getString(R.string.this_is_marker_1_s_snippet))));
        map.setOnMarkerClickListener(marker -> {
            showNavigationButton(marker);
            clearButton.setOnClickListener(v -> {
                clearDirections();
            });
            return false;
        });
    }

    private void clearDirections() {
        if (directionsHandler != null) {
            directionsHandler.clearPolylines();
        }
    }

    private void showNavigationButton(Marker marker) {
        // Assuming navigateButton is in a separate layout, e.g., button_layout.xml
        @SuppressLint("InflateParams") View buttonLayout = getLayoutInflater().inflate(R.layout.navi_button, null);
        Button navigationButton = buttonLayout.findViewById(R.id.navigateButton);
        @SuppressLint("InflateParams") View buttonLayout2 = getLayoutInflater().inflate(R.layout.clear_polyline, null);
        clearButton = buttonLayout2.findViewById(R.id.clearButton);

        if (navigationButton != null) {
            // Set layout parameters to control button size and positioning
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);

            navigationButton.setLayoutParams(layoutParams);

            navigationButton.setVisibility(View.VISIBLE);
            navigationButton.setOnClickListener(v -> showNavigationConfirmationDialog(marker));
        } else {
            Log.e("MapsActivity", "Button not found in layout");
        }

        // Add the button layout to the main layout
        ViewGroup rootView = findViewById(android.R.id.content);
        rootView.addView(buttonLayout);
        rootView.addView(buttonLayout2);
    }
    private void showNavigationConfirmationDialog(Marker clickedMarker) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to navigate to this place?")
                .setPositiveButton("Yes", (dialog, which) -> {
                    // User clicked "Yes," build directions
                    if (clickedMarker != null) {
                        LatLng destination = clickedMarker.getPosition();
                        buildDirections(destination);
                    }else {
                        showEnableLocationNotice();
                    }
                })
                .setNegativeButton("No", (dialog, which) -> {
                    // User clicked "No," do nothing
                })
                .create()
                .show();
    }

    private void showEnableLocationNotice() {
        // Display a notice to enable location services
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Please enable location services to use navigation.")
                .setPositiveButton("OK", (dialog, which) -> {
                    // Open location settings
                    Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    startActivity(intent);
                })
                .create()
                .show();
    }

    private void buildDirections(LatLng destination) {
        directionsHandler = new DirectionsHandler(googleMap);
        Log.d("MapsActivity", "Building directions to: " + destination.toString());
        directionsHandler.drawDirections(locationHandler.getCurrentUserLocation(),destination);

    }

}