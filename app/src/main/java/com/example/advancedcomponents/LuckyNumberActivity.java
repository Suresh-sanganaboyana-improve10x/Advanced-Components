package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class LuckyNumberActivity extends AppCompatActivity {

    public ArrayList<Integer> luckyNumberList;
    public Spinner luckyNumbersSp;
    public ArrayAdapter<Integer> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        getSupportActionBar().setTitle("Lucky Number");
        setupData();
        setupLuckyNumbers();
    }

    public void setupData() {
        luckyNumberList = new ArrayList<>();
        luckyNumberList.add(1);
        luckyNumberList.add(2);
        luckyNumberList.add(3);
        luckyNumberList.add(4);
        luckyNumberList.add(5);
        luckyNumberList.add(6);
        luckyNumberList.add(7);
        luckyNumberList.add(8);
        luckyNumberList.add(9);
        luckyNumberList.add(10);

    }

    public void setupLuckyNumbers() {
        luckyNumbersSp = findViewById(R.id.lucky_numbers_sp);
        arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.dropdown_item, luckyNumberList);
        luckyNumbersSp.setAdapter(arrayAdapter);
        luckyNumbersSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(LuckyNumberActivity.this, "Lucky Number : " +luckyNumberList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}