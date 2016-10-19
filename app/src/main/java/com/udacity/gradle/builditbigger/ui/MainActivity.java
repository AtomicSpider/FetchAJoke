package com.udacity.gradle.builditbigger.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

import com.udacity.gradle.builditbigger.R;
import com.udacity.gradle.builditbigger.tasks.EndpointsAsyncTask;

import display.a.joke.jokedisplayer.JokeDisplayerActivity;


public class MainActivity extends AppCompatActivity {

    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
    }

    public void tellJoke(View view) {
        displayJokeWithProgressbar();
    }

    public void displayJokeWithProgressbar() {
        mProgressBar.setVisibility(View.VISIBLE);

        //delay to show progressbar
        (new Handler()).postDelayed(new Runnable() {
            @Override
            public void run() {
                //fetch joke
                new EndpointsAsyncTask(new EndpointsAsyncTask.Callback() {
                    @Override
                    public void onTaskFinish(String joke) {
                        mProgressBar.setVisibility(View.GONE);
                        Intent mIntent = new Intent(MainActivity.this, JokeDisplayerActivity.class);
                        mIntent.putExtra("joke", joke);
                        startActivity(mIntent);
                    }
                }).execute();
            }
        }, 1000);
    }
}