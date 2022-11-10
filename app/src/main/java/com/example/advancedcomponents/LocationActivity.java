package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class LocationActivity extends AppCompatActivity {

    public  String[] Location = {"AndhraPradesh", "ArunachalPradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "HimachalPradesh",
    "Jammu and Kashmir", "Jharkhand", "Karantaka", "Kerala", "MadhyaPradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland",
    "Odisha", "Punjab", "Rajasthan", "Sikkim", "TamilNadu", "Telangana", "Tripura", "UttarPradesh", "Uttarakhand", "WestBengal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle("Location");
        setUpLocation();
    }

    public void setUpLocation() {
        Spinner locationSp = findViewById(R.id.location_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.state_dropdown_item,Location);
        locationSp.setAdapter(arrayAdapter);
        locationSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(LocationActivity.this, "Location : " + Location[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}