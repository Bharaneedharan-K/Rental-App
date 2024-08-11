package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainpage2 extends AppCompatActivity {

    private Button tocabriolet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage2);

        tocabriolet=findViewById(R.id.cabrioletcar);
        tocabriolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mainpage2.this, cabriolet_list.class);
                startActivities(new Intent[]{intent});
            }
        });

    }
}