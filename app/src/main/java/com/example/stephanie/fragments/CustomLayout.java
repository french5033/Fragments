package com.example.stephanie.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomLayout extends AppCompatActivity{

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customlayout_view);

        Log.d(TAG, "onCreate: Custom Layout");

        Toast.makeText(CustomLayout.this,"Created custom layout", Toast.LENGTH_SHORT).show();

        Button backToMenu = (Button) findViewById(R.id.backbtn);
//
//        // Button setup
        backToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: Back to menu'");

                Intent intent = new Intent(CustomLayout.this, Menu1.class);
                startActivity(intent);
            }
        });
    }
}