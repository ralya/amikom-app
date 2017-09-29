package com.ralyaputra.amikom_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg = "--Amikom App : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(msg, "The on Create() event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The on Start() event");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "The on Resume() event");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg, "The on Pause() event");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(msg, "The on Restart() event");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg, "The on Stop() event");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg, "The on Destroy() event");
    }
}
