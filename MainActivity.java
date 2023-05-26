package com.example.thesheeeesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button) findViewById(R.id.btnCheck);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ((TextView) findViewById(R.id.firstText)).getText().toString();
                String value2 = ((TextView) findViewById(R.id.secondText)).getText().toString();

                Intent intent = new Intent(MainActivity.this, homepage.class);

                if (value1.equals(value2)) {
                    // same
                    intent.putExtra("result", true);
                } else {
                    intent.putExtra("result", false);
                }
                startActivity(intent);
            }
        });

        Button btnSwap = (Button) findViewById(R.id.btnSwap);
        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView firstText = (TextView) findViewById(R.id.firstText) ;
                TextView secondText = (TextView) findViewById(R.id.secondText) ;
                String text1 = firstText.getText().toString();
                String text2 = secondText.getText().toString();
                firstText.setText(text2);
                secondText.setText(text1);
            }
        });

    }
}