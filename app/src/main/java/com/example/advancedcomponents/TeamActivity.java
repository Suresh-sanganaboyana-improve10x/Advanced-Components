package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class TeamActivity extends AppCompatActivity {

    public ArrayList<String> nameList;
    public Spinner teamSp;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setTitle("Team");
        setupData();
        setupNames();
        handleAdd();
    }

    public void handleAdd() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText enterNameTxt = findViewById(R.id.enter_name_txt);
            String name = enterNameTxt.getText().toString();
            if(name.equals("") == false) {
                arrayAdapter.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
            enterNameTxt.setText("");
        });
    }

    public void setupData() {
        nameList = new ArrayList<>();
        nameList.add("Viswanath");
        nameList.add("Renuka");
    }

    public void setupNames() {
        teamSp = findViewById(R.id.team_sp);
        arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, nameList);
        teamSp.setAdapter(arrayAdapter);
    }
}