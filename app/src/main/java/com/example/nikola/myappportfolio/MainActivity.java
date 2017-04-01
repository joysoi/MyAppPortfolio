package com.example.nikola.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt_1;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_1 = (TextView) findViewById(R.id.txt_1);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
    }

    public void toast_event1 (View v){
        Toast.makeText(getApplicationContext(), "Spotify Streamer",Toast.LENGTH_SHORT).show();
    }

    public void toast_event2 (View v){
        Toast.makeText(getApplicationContext(), "SCORES APP",Toast.LENGTH_SHORT).show();
    }

    public void toast_event3 (View v){
        Toast.makeText(getApplicationContext(), "LIBRARY APP",Toast.LENGTH_SHORT).show();
    }

    public void toast_event4 (View v){
        Toast.makeText(getApplicationContext(), "BUILD IN BIGGER",Toast.LENGTH_SHORT).show();
    }

    public void toast_event5 (View v){
        Toast.makeText(getApplicationContext(), "XYZ READER",Toast.LENGTH_SHORT).show();
    }

    public void toast_event6 (View v){
        Toast.makeText(getApplicationContext(), "CAPSTONE: MY OWN APP",Toast.LENGTH_SHORT).show();
    }
}
