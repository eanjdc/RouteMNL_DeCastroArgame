package com.argame.decastroroutemnl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class searchTermTalugtug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_term_talugtug);
    }
    public void displayFivestarCubao(View v) {
        Intent i= new Intent(this, fivestarCubao.class);
        startActivity(i);
        Log.d("logs", "Going to Terminal Details");
    }
}
