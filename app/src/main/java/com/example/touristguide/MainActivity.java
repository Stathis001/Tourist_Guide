package com.example.touristguide;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.res.Configuration;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;



public class MainActivity extends FragmentActivity implements View.OnClickListener {

    Button startButton ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), MapsActivity.class);
        startActivity(intent);
    }

}
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        Button languageButton = findViewById(R.id.languageButton);
        languageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Καλέστε τη μέθοδο για την αλλαγή της γλώσσας
                changeLanguage("en"); // Εδώ χρησιμοποιείται η κωδική ονομασία για τα Αγγλικά ("en")
            }
        });
    }

    // Μέθοδος για την αλλαγή της γλώσσας
    private void changeLanguage(String languageCode) {
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);

        Configuration configuration = new Configuration();
        configuration.setLocale(locale);

        getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());

        // Εδώ μπορείτε να ξανα-φορτώσετε τη δραστηριότητά σας για να εφαρμοστεί η αλλαγή
        recreate();
    }
}
