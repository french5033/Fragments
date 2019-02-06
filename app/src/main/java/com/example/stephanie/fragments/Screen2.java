package com.example.stephanie.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;

public class Screen2 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2_layout);

        // Button setup
        Button back = (Button) findViewById(R.id.back_button);

        // to list view button
        Button toListView = (Button) findViewById(R.id.toListViewButton);

        // setup button onclick
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: clicked button1 ");
                toastMsg("Clicked back button");

                Intent intent = new Intent(Screen2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // list view
        toListView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.d(TAG, "onClick: To List View ");
                toastMsg("To List View");
                Intent intent_2 = new Intent(Screen2.this, ListView1.class);
                startActivity(intent_2);
            }
        });
    }

    private void toastMsg(String msg){
        Toast.makeText(Screen2.this,msg, Toast.LENGTH_SHORT).show();
    }
}