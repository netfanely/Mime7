package com.netfanely.mime7;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Hilos
    Thread t = new Thread() {
    public void run() {
        try {
            sleep(1000);
            Intent i = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(i);
            finish();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    };

    t.start();

}
