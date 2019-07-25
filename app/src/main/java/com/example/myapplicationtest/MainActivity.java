package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("abcd","onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("abcd","onResume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("abcd","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("abcd","onStart");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("abcd","onPause");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("abcd","onDestroy");

    }
}
