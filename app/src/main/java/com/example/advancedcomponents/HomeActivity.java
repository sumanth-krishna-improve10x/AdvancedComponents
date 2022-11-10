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
        handleLuckyNumberBtn();
        handleLocationButton();
        handleDateOfBirth();
        handleTeamButton();
        handleAddMembers();
    }

    public void handleLuckyNumberBtn() {
        Button luckyNumberBtn = findViewById(R.id.lucky_number_btn);
        luckyNumberBtn.setOnClickListener(view -> {
            Intent luckyNumberIntent = new Intent(this, LuckyNumberActivity.class);
            startActivity(luckyNumberIntent);
        });
    }

    public void handleLocationButton() {
        Button locationButton = findViewById(R.id.location_btn);
        locationButton.setOnClickListener(view -> {
            Intent locationIntent = new Intent(this, LocationActivity.class);
            startActivity(locationIntent);
        });
    }

    public void handleDateOfBirth() {
        Button dateOfBirth = findViewById(R.id.date_of_birth_btn);
        dateOfBirth.setOnClickListener(view -> {
            Intent dateOfBirthIntentIntent = new Intent(this, BirthDateActivity.class);
            startActivity(dateOfBirthIntentIntent);
        });
    }

    public void handleTeamButton() {
        Button teamBtn = findViewById(R.id.team_btn);
        teamBtn.setOnClickListener(view -> {
            Intent teamIntent = new Intent(this, TeamActivity.class);
            startActivity(teamIntent);
        });
    }

    public void handleAddMembers() {
        Button addMembersBtn = findViewById(R.id.add_members_btn);
        addMembersBtn.setOnClickListener(view -> {
            Intent addMembersIntent = new Intent(this,AddMembersActivity.class);
            startActivity(addMembersIntent);
        });

    }
}