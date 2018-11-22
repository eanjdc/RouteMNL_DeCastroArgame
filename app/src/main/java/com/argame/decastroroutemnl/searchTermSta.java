package com.argame.decastroroutemnl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class searchTermSta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_term_sta);
    }

    public void displayPhilPasay(View v) {
        Intent i= new Intent(this, philPasay.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }

    public void displayPhilCubao(View v) {
        Intent i= new Intent(this, philCubao.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }
}
