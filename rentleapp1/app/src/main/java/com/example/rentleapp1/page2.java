package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {

    private Button register2;
    private Button tomain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        tomain=findViewById(R.id.maingo);
        tomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(page2.this,mainpage.class);
                startActivities(new Intent[]{intent});

            }
        });
        register2=findViewById(R.id.register);
        register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(page2.this,register.class);
                startActivities(new Intent[]{intent});

            }
        });

    }
}