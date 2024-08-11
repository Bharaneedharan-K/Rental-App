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

public class urbancar extends AppCompatActivity {

    private Button toubbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urbancar);

        toubbill=findViewById(R.id.billubbt);
        toubbill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(urbancar.this, swiftbill.class);
                startActivities(new Intent[]{intent});

            }
        });



        ImageSlider imageSlider = findViewById(R.id.imageSliderub);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.urbanfront, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.urbanback, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.urbanside1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.urbanside2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.urbaninside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}