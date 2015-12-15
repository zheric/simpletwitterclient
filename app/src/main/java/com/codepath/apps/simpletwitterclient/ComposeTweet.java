package com.codepath.apps.simpletwitterclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hang.zhang1 on 12/14/2015.
 */
public class ComposeTweet extends AppCompatActivity {
    private ImageView imageView;
    private TextView username;
    private EditText tweet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);
        imageView = (ImageView) findViewById(R.id.ivCompose);
        username = (TextView) findViewById(R.id.tvUserNameComose);
        tweet = (EditText) findViewById(R.id.editText);

    }
}
