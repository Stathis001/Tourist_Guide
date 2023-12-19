package com.example.touristguide;
import android.graphics.Color;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.PendingResult;
import com.google.maps.android.PolyUtil;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.DirectionsRoute;
import com.google.maps.model.TravelMode;

import java.util.ArrayList;
import java.util.List;

public class DirectionsHandler {
    private GoogleMap googleMap;
    private List<Polyline> polylines;
    private DirectionsApi directionsApi;

    public DirectionsHandler(GoogleMap googleMap) {
        this.googleMap = googleMap;
        this.polylines = new ArrayList<>();
    }

    public void drawDirections(LatLng origin, LatLng destination) {
        // Clear old polylines before adding new ones
        clearPolylines();

        String apiKey = BuildConfig.MAPS_API_KEY;
        GeoApiContext context = new GeoApiContext.Builder().apiKey(apiKey).build();

        // Use the Directions API to get the directions
        DirectionsApiRequest request = DirectionsApi.newRequest(context)
                .mode(TravelMode.WALKING)
                .origin(new com.google.maps.model.LatLng(origin.latitude, origin.longitude))
                .destination(new com.google.maps.model.LatLng(destination.latitude, destination.longitude));

        try {
            DirectionsResult result = request.await();

            if (result.routes != null && result.routes.length > 0) {
                DirectionsRoute route = result.routes[0];
                List<LatLng> decodedPath = decodePolyline(route.overviewPolyline.getEncodedPath());

                PolylineOptions options = new PolylineOptions()
                        .addAll(decodedPath)
                        .width(12)
                        .color(Color.BLUE);

                Polyline newPolyline = googleMap.addPolyline(options);
                polylines.add(newPolyline);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception
        }
    }

    private void clearPolylines() {
        // Remove each polyline from the map and clear the list
        for (Polyline polyline : polylines) {
            polyline.remove();
        }
        polylines.clear();
    }

    private List<LatLng> decodePolyline(String encoded) {
        List<LatLng> poly = new ArrayList<>();
        int index = 0, len = encoded.length();
        int lat = 0, lng = 0;

        while (index < len) {
            int b, shift = 0, result = 0;
            do {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lat += dlat;

            shift = 0;
            result = 0;
            do {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lng += dlng;

            LatLng p = new LatLng(((double) lat / 1E5), ((double) lng / 1E5));
            poly.add(p);
        }

        return poly;
    }
}

