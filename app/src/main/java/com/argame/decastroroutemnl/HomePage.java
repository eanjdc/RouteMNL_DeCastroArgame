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

public class HomePage extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
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
    public void display(View v) {
        Intent i= new Intent(this, SearchHP.class);
        startActivity(i);
        Log.d("logs", "Going to find terminal screen");

    }


}
