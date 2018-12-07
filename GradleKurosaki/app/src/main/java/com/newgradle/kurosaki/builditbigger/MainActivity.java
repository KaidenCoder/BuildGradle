package com.newgradle.kurosaki.builditbigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.newgradle.kurosaki.androidlibrary.AndroidJoke;

public class MainActivity extends AppCompatActivity implements AsyncTaskEndpoint.Callback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view) {
        new AsyncTaskEndpoint(this).execute();
    }


    @Override
    public void onFinished(String result) {
        Intent intent = new Intent(this, AndroidJoke.class);
        intent.putExtra(Intent.EXTRA_TEXT, result);
        startActivity(intent);
    }
}
