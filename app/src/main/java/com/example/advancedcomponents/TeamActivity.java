package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamActivity extends AppCompatActivity {

    public ArrayList<String> namesList;
    public Spinner teamSp;
    public ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setTitle("Team");
        handleAddButton();
        setUpData();
        setUpTeam();
    }

    public void handleAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText enterNameTxt = findViewById(R.id.enter_name_txt);
            String name = enterNameTxt.getText().toString();
            arrayAdapter.add(name);
            arrayAdapter.notifyDataSetChanged();
            enterNameTxt.setText(" ");
        });
    }

    public void setUpData() {
        namesList = new ArrayList<>();
        namesList.add("Viswanath");
        namesList.add("Renuka");
    }

    public void setUpTeam() {
        teamSp = findViewById(R.id.team_sp);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, namesList);
        teamSp.setAdapter(arrayAdapter);
        teamSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(TeamActivity.this, "TeamNames : " + namesList, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}