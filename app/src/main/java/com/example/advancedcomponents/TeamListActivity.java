package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {

    public ListView itemsLv;
    public ArrayList<String> itemsList;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        handleButtonForAdd();
        handleDeleteButton();
        setupDataForListView();
        setupMemberNameListView();
    }

    public void handleDeleteButton() {
        Button deleteBtn = findViewById(R.id.delete_btn);
        deleteBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            String name = memberNameTxt.getText().toString();
            arrayAdapter.remove(name);
            arrayAdapter.notifyDataSetChanged();
            memberNameTxt.setText("");
        });
    }

    public void handleButtonForAdd() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            String nameTxt = memberNameTxt.getText().toString();
            if (nameTxt.equals("") == false) {
                arrayAdapter.add(nameTxt);
                arrayAdapter.notifyDataSetChanged();
            }
            memberNameTxt.setText("");
        });
    }

    public void setupDataForListView() {
        itemsList = new ArrayList<>();
        itemsList.add("Viswanath");
        itemsList.add("Renuka");
    }

    public void setupMemberNameListView() {
        itemsLv = findViewById(R.id.items_lv);
        arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, itemsList);
        itemsLv.setAdapter(arrayAdapter);
        itemsLv.setOnItemClickListener((adapterView, view, position, l) -> {
            Toast.makeText(this, "Clicked : " + itemsList.get(position), Toast.LENGTH_SHORT).show();
            String memberName = itemsList.get(position);
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            memberNameTxt.setText(memberName);
        });
    }
}