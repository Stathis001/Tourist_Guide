package com.example.touristguide;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

public class MapMarker extends FragmentActivity implements GoogleMap.OnMarkerClickListener {

    private int markerId;
    private FusedLocationProviderClient fusedLocationClient;
    private Marker marker;
    private String name;
    private Context context;
    GoogleMap googleMap ;

    public MapMarker(int markerId, Marker marker, String name, Context context) {
        this.markerId = markerId;
        this.marker = marker;
        this.name = name;
        this.context = context;
    }

    public void setPosition(LatLng position) {
        marker.setPosition(position);
    }

    public void remove() {
        marker.remove();
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        displayNavigationButton();
        return false;
    }

    private void displayNavigationButton() {

        View buttonView = LayoutInflater.from(context).inflate(R.layout.navi_button, null);
        Button navigateButton = buttonView.findViewById(R.id.navigateButton);
        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNavigationConfirmationDialog();
            }
        });
        marker.showInfoWindow();
        marker.setInfoWindowAnchor(0.5f, 1.0f);
        marker.setSnippet("this is marker snippet");
    }

    private void showNavigationConfirmationDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Navigate to Marker");
        builder.setMessage("Do you want to navigate to " + name + "?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                LatLng destination = marker.getPosition();
                buildAndDisplayDirections(destination);
            }
        });
        builder.setNegativeButton("No", null);
        builder.show();
    }

    private void buildAndDisplayDirections(LatLng destination) {
       DirectionsHandler directionsHandler = new DirectionsHandler(googleMap);
       LocationHandler locationHandler = new LocationHandler(this,googleMap, fusedLocationClient);
       locationHandler.startLocationUpdates();
       directionsHandler.drawDirections(locationHandler.getCurrentUserLocation(),destination);
    }
}
