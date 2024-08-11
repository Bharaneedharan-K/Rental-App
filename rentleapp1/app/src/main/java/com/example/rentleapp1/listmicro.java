package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class listmicro extends AppCompatActivity {

    private Button tokwid;
    private Button toalto;

    private Button tocpde;

    private Button tonano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmicro);


        tonano=findViewById(R.id.xuvbt);
        tonano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(listmicro.this, nanocar.class);
                startActivities(new Intent[]{intent});

            }
        });


        tocpde=findViewById(R.id.venuebt);
        tocpde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(listmicro.this, cpodcar.class);
                startActivities(new Intent[]{intent});

            }
        });

        toalto=findViewById(R.id.urbanbt);
        toalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(listmicro.this, altocar.class);
                startActivities(new Intent[]{intent});

            }
        });

        tokwid=findViewById(R.id.nexonbt);
        tokwid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(listmicro.this, kwidcar.class);
                startActivities(new Intent[]{intent});

            }
        });
    }
}