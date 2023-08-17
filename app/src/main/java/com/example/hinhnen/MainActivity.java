package com.example.hinhnen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout manHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    manHinh = (ConstraintLayout) findViewById(R.id.manHinh);
    manHinh.setBackgroundResource(R.drawable.bk2);
    }

}