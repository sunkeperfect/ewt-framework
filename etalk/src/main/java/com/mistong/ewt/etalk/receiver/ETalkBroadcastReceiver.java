package com.mistong.ewt.etalk.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by sk on 2017/12/5.
 */

public class ETalkBroadcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(this.getClass().getSimpleName(), System.currentTimeMillis()+"");

    }
}
