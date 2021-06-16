package com.poulstar.ussd_sun_16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView irancel_btn;
    ImageView mci_btn;
    ImageView rightel_btn;
    String[] ussdList;
    public final static String EXTRA_MESSAGE = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        irancel_btn = findViewById(R.id.irancel_btn);
        mci_btn = findViewById(R.id.mci_btn);
        rightel_btn = findViewById(R.id.rightel_btn);

        irancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ussdList = new String[]{"*1#", "*555#", "*444#", "*780#"};
            }

        });

        mci_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ussdList = new String[]{"*22#", "*888#", "*23#", "*788#"};
            }
        });

        rightel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ussdList = new String[]{"*1#", "*555#", "*544#", "*750#"};
            }
        });
    }

    public void sendData(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, ussdList);
        startActivity(intent);
    }
}