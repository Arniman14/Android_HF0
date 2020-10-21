package com.sapi.activitylifecyclemonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityThree extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);


        Button b5 = (Button)findViewById(R.id.button5);
        b5.setOnClickListener(this);

        Log.d(TAG, "ActivityThree: onCreate()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityThree: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityThree: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityThree: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityThree: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityThree: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityThree: onDestroy()");
    }

   /* @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }*/

    @Override
    public void onClick(View c) {
        Intent intent1 = new Intent(this, ActivityTwo.class);
        startActivity(intent1);
    }

    public void startMainActivity(View v) {
        this.finish();
    }
}