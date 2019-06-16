package com.dogancanokur.landmarkbook;

import android.content.Intent;
import android.graphics.Bitmap;
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


//        //---------------------
//        landmarkImageImg.setImageBitmap(MainActivity.selectedImage);
//        // fotoyu basitçe aldık -- değişkene atadık
//        //---------------------
        //---------------------

        GlobalBitmap globalBitmap = GlobalBitmap.getInstance();
        Bitmap bitmap = globalBitmap.getChoosenImage();
        landmarkImageImg.setImageBitmap(bitmap);
        //---------------------


        Intent intent = getIntent();
        // bir önceki intenti al

        String landmarkName = intent.getStringExtra("landmarkName");

        landmarkNameText.setText(landmarkName);

    }
}
