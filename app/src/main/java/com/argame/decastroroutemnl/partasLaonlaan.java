package com.argame.decastroroutemnl;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class partasLaonlaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partas_laonlaan);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.useAdd) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.615769, 120.990953"));
            chooser = Intent.createChooser(i, "Select app");
            startActivity(chooser);
            Log.d("logs", "Service has executed....");
        }
    }
}

