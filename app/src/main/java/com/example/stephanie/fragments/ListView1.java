package com.example.stephanie.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListView1 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        Log.d(TAG, "onCreate: List View");

        TextView tView2 = (TextView) findViewById(R.id.textView2);

        Button menu = (Button) findViewById(R.id.back_2);

        // list view
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: Back to menu'");

                Intent intent = new Intent(ListView1.this, Screen2.class);
                startActivity(intent);
                toastMsg("Back to menu");
            }
        });

    }

    private void toastMsg(String msg){
        Toast.makeText(ListView1.this,msg, Toast.LENGTH_SHORT).show();
    }
}