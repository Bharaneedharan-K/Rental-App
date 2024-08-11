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

public class listsuv extends AppCompatActivity {

    private Button tonexon;
    private Button tourban;

    private Button tovenue;

    private  Button toxuv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listsuv);


        toxuv=findViewById(R.id.xuvbt);
        toxuv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(listsuv.this, xuv.class);
                startActivities(new Intent[]{intent});

            }
        });

        tovenue=findViewById(R.id.venuebt);
        tovenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(listsuv.this, venue.class);
                startActivities(new Intent[]{intent});

            }
        });

        tourban=findViewById(R.id.urbanbt);
        tourban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(listsuv.this, urbancar.class);
                startActivities(new Intent[]{intent});

            }
        });


        tonexon=findViewById(R.id.nexonbt);
        tonexon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(listsuv.this, nexoncar.class);
                startActivities(new Intent[]{intent});

            }
        });

    }
}