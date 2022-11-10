package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class LuckyNumberActivity extends AppCompatActivity {

    public  ArrayList<Integer> luckyNumbers;
     public Spinner luckyNumbersSp;
     public ArrayAdapter<Integer> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        getSupportActionBar().setTitle("Lucky Number");
        setUpLuckyNumbersData();
        setUpLuckyNumbers();
    }

    public void setUpLuckyNumbersData() {
       luckyNumbers= new  ArrayList<Integer>();
       luckyNumbers.add(1);
       luckyNumbers.add(2);
       luckyNumbers.add(3);
       luckyNumbers.add(4);
       luckyNumbers.add(5);
       luckyNumbers.add(6);
       luckyNumbers.add(7);
       luckyNumbers.add(8);
       luckyNumbers.add(9);
       luckyNumbers.add(10);
    }

    public void setUpLuckyNumbers() {
        luckyNumbersSp = findViewById(R.id.lucky_numbers_sp);
        arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.dropdownitem, luckyNumbers);
        luckyNumbersSp.setAdapter(arrayAdapter);
        luckyNumbersSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(LuckyNumberActivity.this, "Lucky Number : " + luckyNumbers, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}