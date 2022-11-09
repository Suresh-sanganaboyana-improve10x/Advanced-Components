package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DateOfBirthActivity extends AppCompatActivity {

    public ArrayList<Integer> selectDatesList;
    public ArrayList<String> selectMonthsList;
    public ArrayList<Integer> selectYearsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
        getSupportActionBar().setTitle("Date of Birth");
        setupDataForYear();
        setupDataForMonth();
        setupDataForDate();
        setupDate();
        setupMonth();
        setupYear();
    }

    public void setupDataForYear() {
        selectYearsList = new ArrayList<>();
        selectYearsList.add(1960);
        selectYearsList.add(1961);
        selectYearsList.add(1962);
        selectYearsList.add(1963);
        selectYearsList.add(1964);
        selectYearsList.add(1965);
        selectYearsList.add(1966);
        selectYearsList.add(1967);
        selectYearsList.add(1968);
        selectYearsList.add(1969);
        selectYearsList.add(1970);
        selectYearsList.add(1971);
        selectYearsList.add(1972);
        selectYearsList.add(1973);
        selectYearsList.add(1974);
        selectYearsList.add(1975);
        selectYearsList.add(1976);
        selectYearsList.add(1977);
        selectYearsList.add(1978);
        selectYearsList.add(1979);
        selectYearsList.add(1980);
        selectYearsList.add(1981);
        selectYearsList.add(1982);
        selectYearsList.add(1983);
        selectYearsList.add(1984);
        selectYearsList.add(1985);
        selectYearsList.add(1986);
        selectYearsList.add(1987);
        selectYearsList.add(1988);
        selectYearsList.add(1989);
        selectYearsList.add(1990);
        selectYearsList.add(1991);
        selectYearsList.add(1992);
        selectYearsList.add(1993);
        selectYearsList.add(1994);
        selectYearsList.add(1995);
        selectYearsList.add(1996);
        selectYearsList.add(1997);
        selectYearsList.add(1998);
        selectYearsList.add(1999);
        selectYearsList.add(2000);
        selectYearsList.add(2001);
        selectYearsList.add(2002);
        selectYearsList.add(2003);
        selectYearsList.add(2004);
        selectYearsList.add(2005);
        selectYearsList.add(2006);
        selectYearsList.add(2007);
        selectYearsList.add(2008);
        selectYearsList.add(2009);
        selectYearsList.add(2010);
        selectYearsList.add(2011);
        selectYearsList.add(2012);
        selectYearsList.add(2013);
        selectYearsList.add(2014);
        selectYearsList.add(2015);
        selectYearsList.add(2016);
        selectYearsList.add(2017);
        selectYearsList.add(2018);
        selectYearsList.add(2019);
        selectYearsList.add(2020);
        selectYearsList.add(2021);
        selectYearsList.add(2022);
    }

    public void setupDataForMonth() {
        selectMonthsList = new ArrayList<>();
        selectMonthsList.add("January");
        selectMonthsList.add("February");
        selectMonthsList.add("March");
        selectMonthsList.add("April");
        selectMonthsList.add("May");
        selectMonthsList.add("Jun");
        selectMonthsList.add("July");
        selectMonthsList.add("August");
        selectMonthsList.add("September");
        selectMonthsList.add("October");
        selectMonthsList.add("november");
        selectMonthsList.add("December");
    }

    public void setupDataForDate() {
        selectDatesList = new ArrayList<>();
        selectDatesList.add(1);
        selectDatesList.add(2);
        selectDatesList.add(3);
        selectDatesList.add(4);
        selectDatesList.add(5);
        selectDatesList.add(6);
        selectDatesList.add(7);
        selectDatesList.add(8);
        selectDatesList.add(9);
        selectDatesList.add(10);
        selectDatesList.add(11);
        selectDatesList.add(12);
        selectDatesList.add(13);
        selectDatesList.add(14);
        selectDatesList.add(15);
        selectDatesList.add(16);
        selectDatesList.add(17);
        selectDatesList.add(18);
        selectDatesList.add(19);
        selectDatesList.add(20);
        selectDatesList.add(21);
        selectDatesList.add(22);
        selectDatesList.add(23);
        selectDatesList.add(24);
        selectDatesList.add(25);
        selectDatesList.add(26);
        selectDatesList.add(27);
        selectDatesList.add(28);
        selectDatesList.add(29);
        selectDatesList.add(30);
        selectDatesList.add(31);

    }

    public void setupDate() {
        Spinner dateSp = findViewById(R.id.date_sp);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, selectDatesList);
        dateSp.setAdapter(arrayAdapter);
        dateSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Date : " + selectDatesList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setupMonth() {
        Spinner monthSp = findViewById(R.id.month_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.date_months_year_item, selectMonthsList);
        monthSp.setAdapter(arrayAdapter);
        monthSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Month : " + selectMonthsList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setupYear() {
        Spinner yearSp = findViewById(R.id.year_sp);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, selectYearsList);
        yearSp.setAdapter(arrayAdapter);
        yearSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Year : " + selectYearsList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}