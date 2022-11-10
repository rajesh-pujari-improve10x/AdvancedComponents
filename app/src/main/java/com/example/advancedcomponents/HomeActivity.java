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
        handleLocationBtn();
        handleDateOfBirthBtn();
        handleTeamBtn();
        handleTeamList();
        handleAllMembersBtn();
    }

    public void handleLuckyNumberBtn() {
        Button luckyNumberBtn = findViewById(R.id.lucky_number_btn);
        luckyNumberBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LuckyNumberActivity.class);
            startActivity(intent);
        });
    }

    public void handleLocationBtn() {
        Button locationBtn = findViewById(R.id.location_btn);
        locationBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LocationActivity.class);
            startActivity(intent);
        });
    }

    public void handleDateOfBirthBtn() {
        Button dateOfBirthBtn = findViewById(R.id.date_of_birth_btn);
        dateOfBirthBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, DateOfBirthActivity.class);
            startActivity(intent);
        });
    }

    public void handleTeamBtn() {
        Button teamBtn = findViewById(R.id.team_btn);
        teamBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamActivity.class);
            startActivity(intent);
        });
    }

    public void handleTeamList() {
        Button teamListBtn = findViewById(R.id.team_list_btn);
        teamListBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamListActivity.class);
            startActivity(intent);
        });
    }

    public void handleAllMembersBtn() {
        Button allMembersBtn = findViewById(R.id.all_members_btn);
        allMembersBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddMembersActivity.class);
            startActivity(intent);
        });
    }
}