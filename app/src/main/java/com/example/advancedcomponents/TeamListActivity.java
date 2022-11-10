package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {

    public ArrayList<String> namesList;
    public ListView teamListLv;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        getSupportActionBar().setTitle("Team List");
        setupNamesListData();
        setupTeamList();
        handleAddBtn();
    }

    public void handleAddBtn() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            String name = memberNameTxt.getText().toString();
            if (name.equals("") == false) {
                arrayAdapter.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
            memberNameTxt.setText("");
        });
    }

    public void setupNamesListData() {
        namesList = new ArrayList<>();
        namesList.add("Viswanath");
        namesList.add("Renuka");
    }

    public void setupTeamList() {
        teamListLv = findViewById(R.id.team_list_lv);
        arrayAdapter = new ArrayAdapter<String>(
                this, R.layout.dropdown_team_item, namesList);
        teamListLv.setAdapter(arrayAdapter);
    }
}