package com.lab1.lab12;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    TextView tv3, tv4, tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv3 = (TextView)findViewById(R.id.TextView3);
        tv4 = (TextView)findViewById(R.id.TextView4);
        tv5 = (TextView)findViewById(R.id.TextView5);
    }


    public void onbutton1Clicked(View v)
    {
        tv3.setText("You threw ROCK");
        int com = (int) (Math.random()*10)%3;
        RPS.comDisplay(com, tv4);
        RPS.realDisplay(0,com,tv5);
    }

    public void onbutton2Clicked(View v)
    {
        tv3.setText("You threw PAPER");
        int com = (int) (Math.random()*10)%3;
        RPS.comDisplay(com, tv4);
        RPS.realDisplay(0,com,tv5);
    }

    public void onbutton3Clicked(View v)
    {
        tv3.setText("You threw SCISSORS");
        int com = (int) (Math.random()*10)%3;
        RPS.comDisplay(com, tv4);
        RPS.realDisplay(0,com,tv5);
    }

}



