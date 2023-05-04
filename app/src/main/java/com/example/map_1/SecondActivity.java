package com.example.map_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Gitpic gitpic;
    private Picdiary picdiary;
    private Sky sky;
    private Button btn1, btn2, act2_1, act2_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec_activity);

        gitpic = new Gitpic();
        sky = new Sky();
        picdiary = new Picdiary();
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        act2_1 = findViewById(R.id.act2_1);
        act2_3 = findViewById(R.id.act2_3);

        getSupportFragmentManager().beginTransaction().add(R.id.f2, picdiary).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.f1, sky).commit();

        act2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        act2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("로그","액티비티 시작 맵맵");
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.f1, sky).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.f1, gitpic).commit();
            }
        });


    }
}