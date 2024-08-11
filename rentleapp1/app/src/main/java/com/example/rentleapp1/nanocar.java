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

public class nanocar extends AppCompatActivity {

    private Button tobillnano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nanocar);

        tobillnano=findViewById(R.id.billnano);
        tobillnano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(nanocar.this, swiftbill.class);
                startActivities(new Intent[]{intent});

            }
        });



        ImageSlider imageSlider = findViewById(R.id.imageSlidernano);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.nanofront, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.nanoback, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.nanoside1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.nanoside2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.nanoinside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}