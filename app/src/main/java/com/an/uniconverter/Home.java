package com.an.uniconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button btnLength2;
    Button btnMass2;
    Button btnSpeed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        System.out.println("onCreate");

        btnLength2 = (Button)findViewById(R.id.btnLength);
        btnMass2 = (Button)findViewById(R.id.btnMass);
        btnSpeed2 = (Button)findViewById(R.id.btnSpeed);

        btnLength2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intentShData = new Intent(Home.this,LengthDistance.class);
                                                startActivity(intentShData);
                                            }
        });

        btnMass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShData = new Intent(Home.this,MassWeight.class);
                startActivity(intentShData);
            }
        });

        btnSpeed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShData = new Intent(Home.this,Temperature.class);
                startActivity(intentShData);
            }
        });


        
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
    }
}
