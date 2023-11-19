package com.example.touristguide;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
