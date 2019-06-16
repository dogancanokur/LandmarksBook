package com.dogancanokur.landmarkbook;

import android.graphics.Bitmap;

public class GlobalBitmap {
    // Global değişken oluşturmak için
    // foto için diğer yöntemden daha verimli faha hafıza friendly

    private static GlobalBitmap instance;
    private Bitmap choosenImage;

    protected GlobalBitmap() {

    }
    
    public static GlobalBitmap getInstance() {
        if (instance == null) {
            instance = new GlobalBitmap();
        }
        return instance;

    }

    public Bitmap getChoosenImage() {
        return choosenImage;
    }

    public void setChoosenImage(Bitmap choosenImage) {
        this.choosenImage = choosenImage;
    }
}
