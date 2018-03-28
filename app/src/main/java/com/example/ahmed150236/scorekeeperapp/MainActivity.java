package com.example.ahmed150236.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int pointA=0;
    int pointB=0;

    // add 3 points for Team A
    public void add_3_for_teamA(View view) {
        pointA+=3;
        displayA(pointA);

    }


    //Add 2 points for team A
    public void add_2_for_teamA(View view) {
        pointA+=2;
        displayA(pointA);
    }

    // Add 1 for team A
    public void add_1_TeamA(View view) {
        pointA+=1;
        displayA(pointA);
    }


    // add 3 points for Team B
    public void add_3_for_teamB(View view) {
        pointB+=3;
        displayB(pointB);
    }


    //Add 2 points for team B
    public void add_2_for_teamB(View view) {
        pointB+=2;
        displayB(pointB);
    }

    // Add 1 for team B
    public void add_1_TeamB(View view) {
        pointB+=1;
        displayB(pointB);
    }


    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamA_score);
        quantityTextView.setText("" + number);
    }

    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamB_score);
        quantityTextView.setText("" + number);
    }


    // reset ponts
    public void reset(View view) {
        pointA=0;
        pointB=0;

        displayA(pointB);
        displayB(pointB);
    }
}
