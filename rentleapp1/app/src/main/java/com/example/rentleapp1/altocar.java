package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class altocar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altocar);
        ImageSlider imageSlider = findViewById(R.id.altoslider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.altofront, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.altoback, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.altoside1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.altoside2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.altoinside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}