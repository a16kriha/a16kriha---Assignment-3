package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private final String[] mountainLocations = {"Alps","Alps","Alaska"};
    private final int[] mountainHeights ={4478,4808,6190};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        List<String> listData = new ArrayList<String>(Arrays.asList(mountainNames));
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),R.layout.list_item_textview,R.id.my_item_textview, listData);

        ListView myListView = (ListView)findViewById(R.id.mainListView);
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = mountainNames[position];
                String height = String.valueOf(mountainHeights[position]);
                String location = mountainLocations[position];

                Intent intent = new Intent(MainActivity.this, MountainDetailsActivity.class);
                intent.putExtra("mountain_name", name.toString());
                intent.putExtra("mountain_location", location.toString());
                intent.putExtra("mountain_height", height.toString());

                startActivity(intent);

            }
        });
    }

}
