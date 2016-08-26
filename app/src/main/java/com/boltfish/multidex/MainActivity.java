package com.boltfish.multidex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Class test = Class.forName("com.applovin.sdk.AppLovinAd");
            Log.i("MainActivity", test.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
