package com.newgradle.kurosaki.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AndroidJoke  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_lib_layout);

        TextView jokeview = (TextView) findViewById(R.id.joke_text);

        String joke = null;
        Intent intent = getIntent();
        joke = intent.getStringExtra(Intent.EXTRA_TEXT);

        if (joke != null){
            jokeview.setText(joke);
        }else {
            jokeview.setText(R.string.no_joke_string);
        }
    }
}