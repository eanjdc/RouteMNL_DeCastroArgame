package com.argame.decastroroutemnl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class searchTermTagaytay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_term_tagaytay);
    }

    public void displayJamBuendia(View v) {
        Intent i= new Intent(this, jamBuendia.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }

    public void displayJamPasay(View v) {
        Intent i= new Intent(this, dltbCubao.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }

    public void displayJamKamuning(View v) {
        Intent i= new Intent(this, jamKamuning.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }
}
