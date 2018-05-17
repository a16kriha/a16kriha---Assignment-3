package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String name = getIntent().getStringExtra("mountain_name");
        String location = getIntent().getStringExtra("mountain_location");
        String height = getIntent().getStringExtra("mountain_height");

        //Toast.makeText(getApplicationContext(), "data = " + data, Toast.LENGTH_SHORT).show();

        TextView mtName = (TextView) findViewById(R.id.mountainNameText);
        TextView mtLocation = (TextView) findViewById(R.id.mountainLocationText);
        TextView mtHeight = (TextView) findViewById(R.id.mountainHeightText);

        mtName.setText(name);
        mtLocation.setText(location);
        mtHeight.setText(height + "m");
    }

}
