package com.b1.ltd.broadcastrec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(MainActivity.TAG,"I am Receiving the action.... ");
    }
}
