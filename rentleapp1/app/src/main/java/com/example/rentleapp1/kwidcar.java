package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class kwidcar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwidcar);

        ImageSlider imageSlider = findViewById(R.id.kwidslider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.kwidfront, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.kwidback, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.kwidside1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.kwidside2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.kwidinside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}