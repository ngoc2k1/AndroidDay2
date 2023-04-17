package com.bichngoc.android_day2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {
    private static final String TAG = ActivityB.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart B");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume B");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause B");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStopB");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart B");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy B");
    }
}