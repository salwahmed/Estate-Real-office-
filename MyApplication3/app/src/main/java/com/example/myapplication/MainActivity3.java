package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void price(View view) {
        EditText etprice=(EditText) findViewById(R.id.etprice);
       int pric=Integer.parseInt(etprice.getText().toString());
       int pri=1000+pric;
        Toast.makeText(this,"pri"+String.valueOf(pri),Toast.LENGTH_LONG).show();
    }
}