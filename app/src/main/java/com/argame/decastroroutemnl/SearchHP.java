package com.argame.decastroroutemnl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SearchHP extends AppCompatActivity {

    Spinner dropdownmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_hp);

        dropdownmenu = (Spinner) findViewById(R.id.spinner_mnlterminal);

        List<String> list = new ArrayList<>();
        list.add("Cabuyao, Laguna");
        list.add("Laoag, Ilocos Norte");
        list.add("Baler, Aurora");
        list.add("Sta. Elena, Camarines Norte");
        list.add("Tagaytay City");
        list.add("Talugtug, Nueva Ecija");
        list.add("Legazpi, Albay");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdownmenu.setAdapter(adapter);
        dropdownmenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemvalue= parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("logs", "onStart has executed..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("logs", "onResume has executed..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("logs", "onStop has executed..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("logs", "onPause has executed..");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("logs", "onRestart has executed..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("logs", "onDestroy has executed.");
    }

}
