package com.example.touristguide;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

public class MapMarker implements GoogleMap.OnMarkerClickListener {
    private int markerID;
    public LatLng markerPos;
    public String markerName;
    private Context context;

    public MapMarker(int id, LatLng markerPos, String markerName) {
        this.markerID = id;
        this.markerPos = markerPos;
        this.markerName = markerName;
    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        showInfoWindow();
        return true;
    }

    private void showInfoWindow() {
        //we need to decide how to display info in this method.
    }
    public int getMarkerID() {
        return markerID;
    }

    public void setMarkerID(int markerID) {
        this.markerID = markerID;
    }

    public LatLng getMarkerPos() {
        return markerPos;
    }

    public void setMarkerPos(LatLng markerPos) {
        this.markerPos = markerPos;
    }

    public String getMarkerName() {
        return markerName;
    }

    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }

    public void setPosition(LatLng location) {
        setMarkerPos(location);
    }
    public void remove() {
        if (markerName != null) {
            remove();
        }
    }
}
public class MapManager {
    // Υποθέτουμε ότι έχετε μια λίστα με τους δείκτες τύπου MapMarker
    private List<MapMarker> markers;

    // Υποθέτουμε ότι έχετε μια αναφορά στο GoogleMap
    private GoogleMap googleMap;

    // Υποθέτουμε ότι έχετε έναν κατασκευαστή που αρχικοποιεί τα markers και το googleMap

    // Υποθέτουμε ότι έχετε μια μέθοδο που ρυθμίζει τους δείκτες στον χάρτη
    public void setMarkersOnMap() {
        for (MapMarker marker : markers) {
            // Προσθέστε τον δείκτη στον χάρτη
            googleMap.addMarker(new MarkerOptions().position(marker.getMarkerPos()).title(marker.getMarkerName()));
        }
    }

    // Μέθοδος που εμφανίζει τις πληροφορίες για έναν δείκτη
    public void showInfoWindow(int markerID) {
        for (MapMarker marker : markers) {
            if (marker.getMarkerID() == markerID) {
                // Εδώ μπορείτε να χρησιμοποιήσετε τη μέθοδο showInfoWindow που έχετε ήδη υλοποιήσει στην κλάση MapMarker
                marker.showInfoWindow();
                break;
            }
        }
    }
}
