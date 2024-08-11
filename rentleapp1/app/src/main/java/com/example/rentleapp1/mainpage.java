package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainpage extends AppCompatActivity {

    private Button nextpage;
    private Button tosedan;
    private Button tomicro;

    private Button tosuv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        tosuv=findViewById(R.id.suvlist);
        tosuv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mainpage.this, listsuv.class);
                startActivities(new Intent[]{intent});
            }
        });


        tomicro=findViewById(R.id.miclist);
        tomicro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mainpage.this, listmicro.class);
                startActivities(new Intent[]{intent});
            }
        });

        nextpage=findViewById(R.id.nextpg);
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mainpage.this,mainpage2.class);
                startActivities(new Intent[]{intent});
            }
        });

        tosedan=findViewById(R.id.sedlist);
        tosedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mainpage.this,sedanlist.class);
                startActivities(new Intent[]{intent});
            }
        });



    }
}