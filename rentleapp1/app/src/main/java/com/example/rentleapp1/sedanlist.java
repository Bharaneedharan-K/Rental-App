package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class sedanlist extends AppCompatActivity {

    private Button toswift;
    private Button toetious;
    private Button totigor;

    private Button toverna;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedanlist);

        toverna=findViewById(R.id.vernacarbt);
        toverna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sedanlist.this, vernacar.class);
                startActivities(new Intent[]{intent});

            }
        });



        totigor=findViewById(R.id.tigorbt);
        totigor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sedanlist.this, tigorcar.class);
                startActivities(new Intent[]{intent});

            }
        });

        toetious=findViewById(R.id.etiousbt);
        toetious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sedanlist.this, etiouscar.class);
                startActivities(new Intent[]{intent});

            }
        });

        toswift=findViewById(R.id.Swiftbt);
        toswift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sedanlist.this,swiftcar.class);
                startActivities(new Intent[]{intent});

            }
        });
    }
}