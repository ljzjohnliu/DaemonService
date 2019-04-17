package com.sunfusheng.daemon.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.sunfusheng.daemon.DaemonHolder;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView vText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vText = (TextView) findViewById(R.id.text);

        Intent intent = new Intent("com.study.test");
//        intent.setFlags(Intent.FLAG_RECEIVER_INCLUDE_BACKGROUND);
        sendBroadcast(intent);

        Log.d(TAG, "onCreate: pid = " + android.os.Process.myPid());
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.startService:
                DaemonHolder.startService();
                break;
            case R.id.stopService:
                DaemonHolder.stopService();
                break;
        }
    }
}
