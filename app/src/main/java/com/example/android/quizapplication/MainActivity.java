package com.example.android.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView play = findViewById(R.id.cardview1);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        CardView howTo = findViewById(R.id.cardview2);
        howTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent howToIntent = new Intent(MainActivity.this, HowTo.class);
                startActivity(howToIntent);
            }
        });
    }
}