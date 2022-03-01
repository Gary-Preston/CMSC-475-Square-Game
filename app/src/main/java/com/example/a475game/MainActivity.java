package com.example.a475game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ToggleButton;

import androidx.navigation.fragment.NavHostFragment;

public class MainActivity extends AppCompatActivity {

    public ToggleButton btnToggleDark;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton startButton = (ImageButton) findViewById(R.id.sButton);
        ImageButton quickPlay = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton tutorial = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton setting = (ImageButton) findViewById(R.id.imageButton12);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v  ) {
                startActivity(new Intent(MainActivity.this, start_activity.class));
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v  ) {
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            }
        });

    }

}