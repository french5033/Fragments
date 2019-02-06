package com.example.stephanie.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

public class MagicalMelody extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_mm);

        Log.d(TAG, "onCreate: Magical Melody Summary");

        Button back3 = (Button) findViewById(R.id.back_3);

//        // list view
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: Back to menu'");

                Intent intent = new Intent(MagicalMelody.this, Menu1.class);
                startActivity(intent);
                toastMsg("Back to menu");
            }
        });
    }

    private void toastMsg(String msg){
        Toast.makeText(MagicalMelody.this,msg, Toast.LENGTH_SHORT).show();
    }
}