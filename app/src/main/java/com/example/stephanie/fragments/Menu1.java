package com.example.stephanie.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;

public class Menu1 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);

        // Button setup
        Button back = (Button) findViewById(R.id.back_button);

        // A New Beginning
        Button game1 = (Button) findViewById(R.id.anb_btn);
        // Magical Melody
        Button game2 = (Button) findViewById(R.id.mm_btn);
        // A Tale of Two Towns
        Button game3 = (Button) findViewById(R.id.tott_btn);
        // DS & DS Cute
        Button game4 = (Button) findViewById(R.id.dsdscutebtn);
        // Animal Parade
        Button game5 = (Button) findViewById(R.id.anipar_btn);
        // Tree of Tranquility
        Button game6 = (Button) findViewById(R.id.tree_btn);

        // setup button onclick
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: clicked button1 ");
                toastMsg("Clicked back button");

                Intent intent = new Intent(Menu1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                //Log.d(TAG, "onClick: clicked 'A New Beginning'");
                //toastMsg("Clicked 'A New Beginning'");

                Intent intent = new Intent(Menu1.this, ANewBeginning.class);
                toastMsg("A New Beginning Summary");
                startActivity(intent);
            }
        });

        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: clicked 'Magical Melody'");
                toastMsg("Clicked 'Magical Melody'");

                Intent intent = new Intent(Menu1.this, MagicalMelody.class);
                toastMsg("Magical Melody Summary");
                startActivity(intent);
            }
        });

        game3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: clicked 'A Tale of Two Towns'");
                toastMsg("Clicked 'A Tale of Two Towns'");
            }
        });

        game4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: clicked 'DS & DS Cute'");
                toastMsg("Clicked 'DS & DS Cute'");
            }
        });

        game5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: clicked 'Animal Parade'");
                toastMsg("Clicked 'Animal Parade'");
            }
        });

        game6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: clicked 'Tree of Tranquility'");
                toastMsg("Clicked 'Tree of Tranquility'");
            }
        });

    }

    private void toastMsg(String msg){
        Toast.makeText(Menu1.this,msg, Toast.LENGTH_SHORT).show();
    }
}