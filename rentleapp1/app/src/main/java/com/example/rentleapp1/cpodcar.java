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

public class cpodcar extends AppCompatActivity {

    private Button tocpbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpodcar);

        tocpbill=findViewById(R.id.billcpbt);
        tocpbill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cpodcar.this, swiftbill.class);
                startActivities(new Intent[]{intent});

            }
        });



        ImageSlider imageSlider = findViewById(R.id.imageSlidercp);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.cpodfront, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.cpodback, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.cpodside1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.cpodside2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.cpodinside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}