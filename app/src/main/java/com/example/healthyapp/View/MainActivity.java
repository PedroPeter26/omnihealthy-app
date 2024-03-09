package com.example.healthyapp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.healthyapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static class Control_alcohol extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_control_alcohol);
        }
    }
}