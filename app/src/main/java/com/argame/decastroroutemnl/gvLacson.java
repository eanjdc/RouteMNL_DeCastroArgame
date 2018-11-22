package com.argame.decastroroutemnl;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class gvLacson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gv_lacson);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.useAdd) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.60899, 120.99307"));
            chooser = Intent.createChooser(i, "Select app");
            startActivity(chooser);
            Log.d("logs", "Service has executed....");
        }
    }
}
