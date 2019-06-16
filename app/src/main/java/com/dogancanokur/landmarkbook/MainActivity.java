package com.dogancanokur.landmarkbook;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<String> landmarkNames = new ArrayList<String>();
        landmarkNames.add("Pisa");
        landmarkNames.add("Colleseo");
        landmarkNames.add("Eiffel");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, landmarkNames);

        listView.setAdapter(arrayAdapter);
    }
}
