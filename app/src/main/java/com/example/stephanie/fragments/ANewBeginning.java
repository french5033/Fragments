package com.example.stephanie.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ANewBeginning extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_newbeginning);

        Log.d(TAG, "onCreate: List View");

        TextView tView2 = (TextView) findViewById(R.id.textView2);

        Button menu = (Button) findViewById(R.id.back_2);

        // list view
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check onclick log
                Log.d(TAG, "onClick: Back to menu'");

                Intent intent = new Intent(ANewBeginning.this, Menu1.class);
                startActivity(intent);
                toastMsg("Back to menu");
            }
        });

    }

    private void toastMsg(String msg){
        Toast.makeText(ANewBeginning.this,msg, Toast.LENGTH_SHORT).show();
    }
}