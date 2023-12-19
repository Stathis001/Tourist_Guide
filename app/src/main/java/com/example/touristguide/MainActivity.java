package com.example.touristguide;

import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

    Button startButton;

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

    public void showPopup(View filter) {
        PopupMenu popup = new PopupMenu(this, filter);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_filters_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
       /* switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(this, "Item 4 clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }*/
        int id = item.getItemId();
        if (id==R.id.item1){
            Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item2) {
            Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item3) {
            Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id==R.id.item4) {
            Toast.makeText(this, "Item 4 clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            return false;
        }
    }

    Button startButton, languageButton;

protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.start_screen);
    languageButton = findViewById(R.id.languageButton);
    languageButton.setOnClickListener(this::showLanguageDialog);
    startButton = findViewById(R.id.startButton);
    startButton.setOnClickListener(this);
}

@Override
public void onClick(View v) {
    Intent intent = new Intent(v.getContext(), MapsActivity.class);
    startActivity(intent);
}

private void showLanguageDialog(View v) {
    List<String> supportedLanguages = Arrays.asList(getString(R.string.english), getString(R.string.greek), getString(R.string.german));

    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle("Select Language")
            .setItems(supportedLanguages.toArray(new String[0]), (dialog, which) -> {
                String selectedLanguage = supportedLanguages.get(which);
                changeLanguage(selectedLanguage);
                recreate(); // Restart the activity to apply the language change
            });
    AlertDialog dialog = builder.create();
    dialog.show();
}
private void changeLanguage(String language) {
    Locale newLocale;
    if (language.equalsIgnoreCase("german")) {
        newLocale = Locale.GERMAN;
    } else if (language.equalsIgnoreCase("greek")) {
        newLocale = new Locale("el");
    } else {
        newLocale = Locale.ENGLISH;
    }

    // Update the configuration
    Resources resources = getResources();
    Configuration configuration = resources.getConfiguration();
    configuration.setLocale(newLocale);
    resources.updateConfiguration(configuration, resources.getDisplayMetrics());

    // You may also want to save the selected language for future use
    // e.g., using SharedPreferences
    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
    preferences.edit().putString("selected_language", language).apply();
}

}
