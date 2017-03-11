package com.example.cursoandroid.moviesandroid.network;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

import com.example.cursoandroid.moviesandroid.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by alumno on 11/03/2017.
 */

public class Networkconnection extends AsyncTask<Void,Void,Boolean>  {

    private final String TAG=Networkconnection.class.getSimpleName();
    private Context context;


    public Networkconnection(Context context){

        this.context=context;

    }

    @Override
    protected Boolean doInBackground(Void... params) {

        final String BASE_URL="http://api.themoviedb.org/3/movie";
        final String POPULAR_PATH="popular";
        final String API_KEY_PARAM="api_key";

        Uri ruiToAPI = Uri.parse(BASE_URL).buildUpon()
                .appendEncodedPath(POPULAR_PATH)
                .appendQueryParameter(API_KEY_PARAM,context.getString(R.string.api_key_value))
                .build();

        HttpURLConnection urlConnection;
        BufferedReader reader;

        try {
            URL url new URL(uriToAPI.toString());
            urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream=urlConnection.getInputStream();

        } catch(MalformedURLException e){
            e.printStackTrace();

        }catch (IOException )

        //return null;
    }
}
