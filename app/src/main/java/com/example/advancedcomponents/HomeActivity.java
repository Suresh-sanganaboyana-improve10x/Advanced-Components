package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        displayLuckNumberActivity();
        displayLocationActivity();
        displayDateOfBirthActivity();
        displayTeamActivity();
        displayAddMembersActivity();
    }

    public void displayLuckNumberActivity() {
        Button luckyNumberBtn = findViewById(R.id.lucky_number_btn);
        luckyNumberBtn.setOnClickListener(view -> {
            Intent luckyNumIntent = new Intent(this, LuckyNumberActivity.class);
            startActivity(luckyNumIntent);
        });
    }

    public void displayLocationActivity() {
        Button locationBtn = findViewById(R.id.location_btn);
        locationBtn.setOnClickListener(view -> {
            Intent locationIntent = new Intent(this, LocationActivity.class);
            startActivity(locationIntent);
        });
    }

    public void displayDateOfBirthActivity() {
        Button dateOfBirthBtn = findViewById(R.id.date_of_birth_btn);
        dateOfBirthBtn.setOnClickListener(view -> {
            Intent dateOfBirthIntent = new Intent(this, DateOfBirthActivity.class);
            startActivity(dateOfBirthIntent);
        });
    }

    public void displayTeamActivity() {
        Button teamBtn = findViewById(R.id.team_btn);
        teamBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamActivity.class);
            startActivity(intent);
        });
    }

    public void displayAddMembersActivity() {
        Button addMembersBtn = findViewById(R.id.add_members_btn);
        addMembersBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddMembersActivity.class);
            startActivity(intent);
        });
    }
}