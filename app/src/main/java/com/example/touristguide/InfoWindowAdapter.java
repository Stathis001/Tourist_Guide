import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Προσθήκη marker στο χάρτη
        LatLng markerPosition = new LatLng(37.7749, -122.4194);
        MarkerOptions markerOptions = new MarkerOptions().position(markerPosition).title("Κάποιος Marker");
        Marker marker = mMap.addMarker(markerOptions);

        // Καθορισμός του προσαρμοσμένου InfoWindowAdapter στον χάρτη
        CustomInfoWindowAdapter infoWindowAdapter = new CustomInfoWindowAdapter(this);
        mMap.setInfoWindowAdapter(infoWindowAdapter);

        // Κεντράρισμα του χάρτη στο marker
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(markerPosition, 12.0f));

        // Εμφάνιση των πληροφοριών του marker κατά το κλικ
        marker.showInfoWindow();
    }
}
