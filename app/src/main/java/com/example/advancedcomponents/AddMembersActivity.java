package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class AddMembersActivity extends AppCompatActivity {

    public ArrayList<String> selectTeamList;
    public ArrayList<String> allMembersList;
    public ArrayList<String> teamAList;
    public ArrayList<String> teamBList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_members);
        setupDataForTeamB();
        setupDataForTeamA();
        setupDataForAllMembers();
        setupDataForSelectTeam();

        setupSelectTeam();
        allMembersSpinner();
        setTeamASpinner();
        setTeamBSpinner();
    }

    public void setupDataForTeamB() {
        teamBList = new ArrayList<>();
        teamBList.add("Viswanath");
        teamBList.add("Renuka");
    }

    public void setupDataForTeamA() {
        teamAList = new ArrayList<>();
        teamAList.add("Viswanath");
        teamAList.add("Renuka");
    }

    public void setupDataForAllMembers() {
        allMembersList = new ArrayList<>();
        allMembersList.add("Viswanath");
        allMembersList.add("Renuka");
    }

    public void setupDataForSelectTeam() {
        selectTeamList = new ArrayList<>();
        selectTeamList.add("Viswanath");
        selectTeamList.add("Renuka");
    }

    public void setupSelectTeam() {
        Spinner selectTeamSp = findViewById(R.id.select_team_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, selectTeamList);
        selectTeamSp.setAdapter(arrayAdapter);
    }

    public void allMembersSpinner() {
        Spinner allMembersSp = findViewById(R.id.all_members_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, allMembersList);
        allMembersSp.setAdapter(arrayAdapter);
    }

    public void setTeamASpinner() {
        Spinner teamASp = findViewById(R.id.team_a_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, teamAList);
        teamASp.setAdapter(arrayAdapter);
    }

    public void setTeamBSpinner() {
        Spinner teamBSp = findViewById(R.id.team_b_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,teamBList);
        teamBSp.setAdapter(arrayAdapter);
    }
}