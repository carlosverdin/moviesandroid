package com.example.cursoandroid.moviesandroid;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG=MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uriExample;
        Uri.Builder builder = Uri.parse("http://www.google.com").buildUpon();

        builder.appendPath("users");
        builder.appendPath("params");
        builder.appendQueryParameter("id","302508141");
        builder.appendQueryParameter("name","Carlos Verdin");

        uriExample=builder.build();

        Log.d(TAG,"Url: "+uriExample.toString());

        uriExample=Uri.parse("http://www.google.com").buildUpon()
                .appendPath("users")
                .appendPath("params")
                .appendQueryParameter("id","2902168")
                .appendQueryParameter("name","Carlos")
                .build();


    }
}
