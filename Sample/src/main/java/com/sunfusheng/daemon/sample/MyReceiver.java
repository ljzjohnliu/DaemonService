package com.sunfusheng.daemon.sample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * author: ljz
 * created on: 19-4-17 上午9:48
 * description:
 */
public class MyReceiver extends BroadcastReceiver {

    private static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: action = " + intent.getAction());
    }
}
