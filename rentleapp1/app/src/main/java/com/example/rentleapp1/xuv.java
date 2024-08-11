package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class xuv extends AppCompatActivity {

    private Button toxuvbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuv);

        toxuvbill=findViewById(R.id.billxuvbt);
        toxuvbill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(xuv.this, swiftbill.class);
                startActivities(new Intent[]{intent});

            }
        });



        ImageSlider imageSlider = findViewById(R.id.imageSliderxuv);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.xuv400front, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.xuv400back, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.xuv400side1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.xuv400side2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.xuv400inside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}