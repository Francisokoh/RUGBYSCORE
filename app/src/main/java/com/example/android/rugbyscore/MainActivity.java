package com.example.android.rugbyscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.rugbyscore.R;

public class MainActivity extends AppCompatActivity {
    //Tracks to score for Team A
    int scoreTeamA = 0;
    //Tracks to score for Team B
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Increase the score for team A by 1 point.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for team A by 1 point.
     */
    public void addThreeAgainForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for team A by 2 points.
     */
    public void addTwoForTeamA(View v){
        scoreTeamA= scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for team A by 3 points.
     */

    public void addFiveForTeamA(View v){
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);

    }
    /**
     * Increase the score for team B by 1 points.
     */
    public void addThreeForTeamB (View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }
    /**
     * Increase the score for team B by 1 points.
     */
    public void addThreeAgainForTeamB (View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }
    /**
     * Increase the score for team B by 2 points.
     */
    public void addTwoForTeamB (View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }/**
     * Increase the score for team B by 3 points.
     */
    public void addFiveForTeamB (View v) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);

    }
    public void resetScore (View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    /**
     * Displays the given score for a Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for a Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}


