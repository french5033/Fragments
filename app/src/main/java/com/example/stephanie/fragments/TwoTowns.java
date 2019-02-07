package com.example.stephanie.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TwoTowns extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_twotowns);

        Log.d(TAG, "onCreate: 'A Tale of Two Towns' Summary");

        Button backToMenu = (Button) findViewById(R.id.menu);

////        // list view
        backToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: Back to menu'");

                Intent intent = new Intent(TwoTowns.this, Menu1.class);
                startActivity(intent);
                toastMsg("Back to menu");
            }
        });
    }

    private void toastMsg(String msg){
        Toast.makeText(TwoTowns.this,msg, Toast.LENGTH_SHORT).show();
    }
}
