package com.example.admin.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
boolean isPlaying=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlaying) {
                    Intent i = new Intent(MainActivity.this, PlayServices.class);
                    startService(i);
                }
                else{
                    Intent i = new Intent(MainActivity.this, PlayServices.class);
                    stopService(i);
                }
               isPlaying= !isPlaying;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,PlayServices.class);
                stopService(i);
            }
        });

    }
}
