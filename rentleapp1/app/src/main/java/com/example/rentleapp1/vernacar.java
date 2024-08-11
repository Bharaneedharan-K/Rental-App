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

public class vernacar extends AppCompatActivity {

    private Button tovrbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vernacar);

        tovrbill=findViewById(R.id.billvrbt);
        tovrbill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vernacar.this, swiftbill.class);
                startActivities(new Intent[]{intent});

            }
        });



        ImageSlider imageSlider = findViewById(R.id.imageSlidervr);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.vernafront, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.vernaback, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.vernaside1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.vernaside2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.vernainside, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}