package com.argame.decastroroutemnl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class searchTermLao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_term_lao);
    }

    public void displayFarinas(View v) {
        Intent i= new Intent(this, farinasLacson.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }

    public void displayGv(View v) {
        Intent i= new Intent(this, gvLacson.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }

    public void displayPartasCub(View v) {
        Intent i= new Intent(this, partasCubao.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }

    public void displayPartasLaonlaan(View v) {
        Intent i= new Intent(this, partasLaonlaan.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }

    public void displayPartasPasay(View v) {
        Intent i= new Intent(this, partasPasay.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }
}
