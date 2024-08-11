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

public class nexoncar extends AppCompatActivity {


    private Button tonxbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nexoncar);

        tonxbill=findViewById(R.id.billnxbt);
        tonxbill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(nexoncar.this, swiftbill.class);
                startActivities(new Intent[]{intent});

            }
        });



        ImageSlider imageSlider = findViewById(R.id.imageSlidernx);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.nexonfront, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.nexonback, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.nexonside1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.nexonside2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.nexoninside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}