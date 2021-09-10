package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button inc,dec,reset;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc= findViewById(R.id.increment);
        dec= findViewById(R.id.decrement);
        reset = findViewById(R.id.reset);
        TextView resTv = findViewById(R.id.resView);

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                resTv.setText(count + " Clicks!");
            }
        });
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                resTv.setText(count + " Clicks!");
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                if(count == 0){
                    resTv.setText("Counter reset");
                }else
                resTv.setText(count + " Clicks!");
            }
        });
    }
    public void buttonClicked(View v){
        Log.i("MY_APP", "toimii");
        TextView tv = findViewById(R.id.textView);
        tv.setText("Goodbye World");

    }

}