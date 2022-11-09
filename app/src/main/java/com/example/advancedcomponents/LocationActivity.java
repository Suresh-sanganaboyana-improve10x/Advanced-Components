package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class LocationActivity extends AppCompatActivity {

    public ArrayList<String> locationStatesList;
    public ArrayAdapter<String> arrayAdapter;
    public Spinner locationSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle("Location");
        setupData();
        setupLocation();
    }

    public void setupData() {
        locationStatesList = new ArrayList<>();
        locationStatesList.add("Andra Pradesh");
        locationStatesList.add("Arunachal Pradesh");
        locationStatesList.add("Assam");
        locationStatesList.add("Bihar");
        locationStatesList.add("Chhattisgarh");
        locationStatesList.add("Goa");
        locationStatesList.add("Gujarat");
        locationStatesList.add("Haryana");
        locationStatesList.add("Himachal Pradesh");
        locationStatesList.add("Jharkhand");
        locationStatesList.add("Jammu and Kashmir");
        locationStatesList.add("Karnataka");
        locationStatesList.add("Kerala");
        locationStatesList.add("Madhya Pradesh");
        locationStatesList.add("Maharashtra");
        locationStatesList.add("Manipur");
        locationStatesList.add("Meghalaya");
        locationStatesList.add("Mizoram");
        locationStatesList.add("Nagaland");
        locationStatesList.add("Odisha");
        locationStatesList.add("Punjab");
        locationStatesList.add("Rajasthan");
        locationStatesList.add("Sikkim");
        locationStatesList.add("West Bengal");
        locationStatesList.add("Tamil Nadu");
        locationStatesList.add("Tripura");
        locationStatesList.add("Telangana");
        locationStatesList.add("Uttar Pradesh");
    }

    public void setupLocation() {
        locationSp = findViewById(R.id.location_sp);
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.all_caps_dropdown_item, locationStatesList);
        locationSp.setAdapter(arrayAdapter);
        locationSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(LocationActivity.this, "Location : " + locationStatesList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}