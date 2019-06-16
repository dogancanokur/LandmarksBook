package com.dogancanokur.landmarkbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    ImageView landmarkImageImg;
    TextView landmarkNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        landmarkImageImg = findViewById(R.id.landmarkImageAct);
        landmarkNameText = findViewById(R.id.landmarkNameAct);

        Intent intent = getIntent();
        // bir önceki intenti al

        String landmarkName = intent.getStringExtra("landmarkName");

        landmarkNameText.setText(landmarkName);

    }
}
