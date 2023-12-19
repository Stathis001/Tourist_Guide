package com.example.touristguide;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.res.Configuration;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        Button filtersButton = findViewById(R.id.filtersButton);

        filtersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.filters_menu, popupMenu.getMenu());

        // Προσθέστε ακροατές γεγονότων για τις επιλογές του μενού
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.filter_option_1:
                        // Εκτελέστε κάποια ενέργεια για την επιλογή 1
                        return true;
                    case R.id.filter_option_2:
                        // Εκτελέστε κάποια ενέργεια για την επιλογή 2
                        return true;
                    // Προσθέστε περισσότερες περιπτώσεις αν χρειάζεται
                    default:
                        return false;
                }
            }
        });

        popupMenu.show();
    }
}
popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.filter_option_1:
                // Εκτέλεση κάποιας ενέργειας για την Επιλογή 1
                doSomethingForFilterOption1();
                return true;
            case R.id.filter_option_2:
                // Εκτέλεση κάποιας ενέργειας για την Επιλογή 2
                doSomethingForFilterOption2();
                return true;
            case R.id.filter_option_3:
                // Εκτέλεση κάποιας ενέργειας για την Επιλογή 3
                doSomethingForFilterOption3();
                return true;
            // Προσθήκη επιπλέον περιπτώσεων αν χρειάζεται
            default:
                return false;
        }
    }
});
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
     private void applyFilters() {
        // Εδώ θα προσθέσετε την λογική για την εφαρμογή των φίλτρων
        // Π.χ., εμφάνιση μηνύματος κατά την εφαρμογή των φίλτρων
        Toast.makeText(this, "Εφαρμογή των φίλτρων", Toast.LENGTH_SHORT).show();
    }
}
