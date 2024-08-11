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

public class tigorcar extends AppCompatActivity {

private Button tobill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tigorcar);

        tobill=findViewById(R.id.billtgbt);
        tobill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(tigorcar.this, swiftbill.class);
                startActivities(new Intent[]{intent});

            }
        });


        ImageSlider imageSlider = findViewById(R.id.imageSlidertg);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.tigorfront, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.tigorback, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.tigorside1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.tigorside2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.etiosinside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}

