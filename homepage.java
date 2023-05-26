package com.example.thesheeeesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        boolean result = getIntent().getBooleanExtra("result", false);
        if (result)
            ((TextView) findViewById(R.id.outputTxt)).setText("SAME");
        else
            ((TextView) findViewById(R.id.outputTxt)).setText("NOT SAME");
    }
}