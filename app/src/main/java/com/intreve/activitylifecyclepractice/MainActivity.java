package com.intreve.activitylifecyclepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("alc", "onCreate invoked ");
        Toast.makeText(MainActivity.this, "onCreate invoked", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("alc", "onStart invoked");
        Toast.makeText(MainActivity.this, "onStart invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("alc", "onResume invoked");
        Toast.makeText(MainActivity.this, "onResume invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("alc", "onPause invoked");
        Toast.makeText(MainActivity.this, "onPause invoked", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("alc", "onStop invoked");
        Toast.makeText(MainActivity.this, "onStop invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("alc", "onDestroy invoked");
        Toast.makeText(this, "onDestroy invoked", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("alc", "onRestart invoked");
        Toast.makeText(this, "onRestart invoked", Toast.LENGTH_LONG).show();

    }




}