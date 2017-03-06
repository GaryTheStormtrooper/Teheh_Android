package com.github.nkzawa.socketio.tehahChat;

import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import java.util.UUID;


public class MainActivity extends ActionBarActivity  {

    public static String uniqueID = UUID.randomUUID().toString().substring(0,7);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
