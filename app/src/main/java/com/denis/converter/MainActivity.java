package com.denis.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private BlankFragment blankFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blankFragment = new BlankFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame1, blankFragment)
                .commit();


    }

}