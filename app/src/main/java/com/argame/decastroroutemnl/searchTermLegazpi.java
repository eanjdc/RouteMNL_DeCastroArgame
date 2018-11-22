package com.argame.decastroroutemnl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class searchTermLegazpi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_term_legazpi);
    }

    public void displaySuperlines(View v) {
        Intent i= new Intent(this, superlinesCubao.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }

    public void displayDltbCub(View v) {
        Intent i= new Intent(this, dltbCubao.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }

    public void displayDltbPasay(View v) {
        Intent i= new Intent(this, dltbPasay.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }

    public void displayDltbBuendia(View v) {
        Intent i= new Intent(this, dltbBuendia.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }
}
