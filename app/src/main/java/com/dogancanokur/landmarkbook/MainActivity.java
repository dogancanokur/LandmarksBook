package com.dogancanokur.landmarkbook;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        final ArrayList<String> landmarkNames = new ArrayList<String>();
        landmarkNames.add("Pisa");
        landmarkNames.add("Collesseum");
        landmarkNames.add("Eiffel");
        landmarkNames.add("London Bridge");
        landmarkNames.add("Leander's Tower");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, landmarkNames);
        listView.setAdapter(arrayAdapter);

        Bitmap pisa = BitmapFactory.decodeResource(this.getResources(), R.drawable.pisa);
        Bitmap collesseum = BitmapFactory.decodeResource(this.getResources(), R.drawable.colosseum);
        Bitmap eiffel = BitmapFactory.decodeResource(this.getResources(), R.drawable.eiffel);
        Bitmap londonBridge = BitmapFactory.decodeResource(this.getResources(), R.drawable.londonbridge);
        Bitmap leadensTower = BitmapFactory.decodeResource(this.getResources(), R.drawable.leanderstower);

        final ArrayList<Bitmap> landmarksImages = new ArrayList<Bitmap>();
        landmarksImages.add(pisa);
        landmarksImages.add(collesseum);
        landmarksImages.add(eiffel);
        landmarksImages.add(londonBridge);
        landmarksImages.add(leadensTower);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // position tıkladığımız pozisyon index 0 dan başlıyor array ile aynı
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("landmarkName",landmarkNames.get(position));
//                intent.putExtra("landmarkPhoto",landmarksImages.get(position));
                startActivity(intent);
            }
        });

    }
}
