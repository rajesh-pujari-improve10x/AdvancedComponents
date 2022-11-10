package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddMembersActivity extends AppCompatActivity {

    public String[] team = {"Team A", "Team B"};
    public String[] allMembers = {"Viswanath", "Renuka"};
    public String[] teamA = {"Viswanath", "Renuka"};
    public String[] teamB = {"Viswanath", "Renuka"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_members);
        getSupportActionBar().setTitle("All Members");
        selectTeam();
        selectAllMembers();
        selectTeamA();
        selectTeamB();
    }

    public void selectTeam() {
        Spinner selectTeamSp = findViewById(R.id.select_team_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, R.layout.dropdown_team_item, team);
        selectTeamSp.setAdapter(arrayAdapter);
    }

    public void selectAllMembers() {
        Spinner allMembersSp = findViewById(R.id.all_members_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, R.layout.dropdown_team_item, allMembers);
        allMembersSp.setAdapter(arrayAdapter);
    }
    public void selectTeamA() {
        Spinner teamASp = findViewById(R.id.team_a_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, R.layout.dropdown_team_item, teamA);
        teamASp.setAdapter(arrayAdapter);
    }

    public void selectTeamB() {
        Spinner teamBSp = findViewById(R.id.team_b_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, R.layout.dropdown_team_item, teamB);
        teamBSp.setAdapter(arrayAdapter);
    }
}