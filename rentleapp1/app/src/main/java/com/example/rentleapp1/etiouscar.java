package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class etiouscar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etiouscar);
        ImageSlider imageSlider = findViewById(R.id.imageSlider2);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.etiosfront, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.etiosback, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.etosside1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.etosside2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.etiosinside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}