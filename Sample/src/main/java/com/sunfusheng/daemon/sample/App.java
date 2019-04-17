package com.sunfusheng.daemon.sample;

import android.app.Application;
import android.util.Log;

import com.sunfusheng.daemon.DaemonHolder;
import com.sunfusheng.daemon.DaemonUtil;

/**
 * @author sunfusheng on 2018/8/1.
 */
public class App extends Application {
    private static final String TAG = "App";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate() PID Name = 【" + DaemonUtil.getProcessName(this) + "】, PID = " + android.os.Process.myPid());
        DaemonHolder.init(this, HeartBeatService.class);
    }
}
