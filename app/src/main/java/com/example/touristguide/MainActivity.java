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

}
