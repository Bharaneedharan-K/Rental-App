package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class swiftcar extends AppCompatActivity {

    private Button toswbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiftcar);

        toswbill=findViewById(R.id.billtgbt);
        toswbill.setOnClickListener(v -> startActivity(new Intent(swiftcar.this, swiftbill.class)));
        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.front, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.back, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.side1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.side2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.inside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}