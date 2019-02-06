package com.example.stephanie.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ListView1 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2_layout);

        // list view
//
//        android.widget.ListView listView;
//        listView = (android.widget.ListView)findViewById(R.id.listview);
//
//        ArrayList<String> name = new ArrayList<>();
//        name.add("Popuri");
//        name.add("Blue");
//        name.add("Chen");
//        name.add("Cam");
//        name.add("Alex");
//        name.add("Carl");
//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, name);
//        listView.setAdapter(adapter);

        Log.d(TAG, "onCreate: List View");

        // Button setup
        Button lv_btn1 = (Button) findViewById(R.id.backbutton_2);

        // setup button onclick
        lv_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: clicked button ");

                Intent intent = new Intent(ListView1.this, Screen2.class);
                startActivity(intent);

                toastMsg("Going back to screen 2");
            }
        });

    }

    private void toastMsg(String msg){
        Toast.makeText(ListView1.this,msg, Toast.LENGTH_SHORT).show();
    }
}