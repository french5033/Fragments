package com.example.stephanie.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Starting...");

        //ImageView
        ImageView img1 = (ImageView) findViewById(R.id.harvestmoon1);
        // Button setup
        Button button1 = (Button) findViewById(R.id.btn1);
        // setup button onclick
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: clicked button ");
                Intent intent = new Intent(MainActivity.this, Screen2.class);
                startActivity(intent);
                toastMsg("Going to screen 2");
            }
        });
    }

    private void toastMsg(String msg){
        Toast.makeText(MainActivity.this,msg, Toast.LENGTH_SHORT).show();
    }
}