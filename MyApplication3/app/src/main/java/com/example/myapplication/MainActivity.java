package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startt(View view) {

    }

    public void click(View view) {
        ImageButton txt= findViewById(R.id.txt);

        Intent myint=new Intent(this,MainActivity2.class);
        startActivity(myint);
    }
}