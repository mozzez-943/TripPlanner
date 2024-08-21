package com.example.tripplanner;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.tripplanner.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Spinner;

// MainActivity.java
public class MainActivity extends AppCompatActivity {
    private Spinner tripTypeSpinner;
    private Button planTripButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tripTypeSpinner = findViewById(R.id.tripTypeSpinner);
        planTripButton = findViewById(R.id.planTripButton);

        planTripButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedTripType = tripTypeSpinner.getSelectedItem().toString();
                // Navigate to the checklist activity based on the selected trip type
                Intent intent = new Intent(MainActivity.this, ChecklistActivity.class);
                intent.putExtra("tripType", selectedTripType);
                startActivity(intent);
            }
        });
    }
}
