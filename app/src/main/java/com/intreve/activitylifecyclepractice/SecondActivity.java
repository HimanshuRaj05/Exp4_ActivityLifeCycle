package com.intreve.activitylifecyclepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("alc", "onCreate invoked Second Activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("alc", "onStart Invoked Second Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("alc", "onResume invoked Second Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("alc", "onPause invoked Second Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("alc", "onStop invoked Second Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("alc", "onDestroy invoked Destroy Second Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("alc", "onRestart invoked Second Activity");
    }

}