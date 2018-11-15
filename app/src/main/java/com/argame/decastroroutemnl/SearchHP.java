package com.argame.decastroroutemnl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SearchHP extends AppCompatActivity {

    Spinner dropdownmenu;
    String[] SPINNERVALUES = {"Cabuyao, Laguna", "Laoag, Ilocos Norte", "Baler, Aurora", "Legazpi, Albay", "Sta. Elena, Camarines Norte", "Talugtug, Nueva Ecija", "Tagaytay City"};
    String SpinnerValue;
    Button GOTO;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_hp);

        dropdownmenu = (Spinner) findViewById(R.id.spinner_mnlterminal);
        GOTO = (Button) findViewById(R.id.searchBtn);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, SPINNERVALUES);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdownmenu.setAdapter(adapter);
        dropdownmenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerValue = (String)dropdownmenu.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        GOTO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (SpinnerValue){
                    case "Baler, Aurora":
                        intent = new Intent(SearchHP.this, searchTermBal.class);
                        startActivity(intent);
                        break;
                    case "Cabuyao, Laguna":
                        intent = new Intent(SearchHP.this, searchTermCab.class);
                        startActivity(intent);
                        break;
                    case "Laoag, Ilocos Norte":
                        intent = new Intent(SearchHP.this, searchTermLao.class);
                        startActivity(intent);
                        break;
                    case "Legazpi, Albay":
                        intent = new Intent(SearchHP.this, searchTermLegazpi.class);
                        startActivity(intent);
                        break;
                    case "Sta. Elena, Camarines Norte":
                        intent = new Intent(SearchHP.this, searchTermSta.class);
                        startActivity(intent);
                        break;
                    case "Tagaytay City":
                        intent = new Intent(SearchHP.this, searchTermTagaytay.class);
                        startActivity(intent);
                        break;
                    case "Talugtug, Nueva Ecija":
                        intent = new Intent(SearchHP.this, searchTermTalugtug.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

