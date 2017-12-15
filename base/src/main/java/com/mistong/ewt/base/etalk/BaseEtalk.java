package com.mistong.ewt.base.etalk;

import android.app.Activity;

import android.support.v4.app.Fragment;
import android.util.Log;

import java.util.Map;

/**
 * Created by sk on 2017/11/30.
 */

public class BaseEtalk implements IEtalk {


    @Override
    public void initComponent() {
        Log.i("Etalk","execute initComponent!");

    }

    @Override
    public void start(Activity activity) {

    }

    @Override
    public void distroyComponent() {
        Log.i("Etalk","execute distroyComponent!");
    }

    @Override
    public void gotoEtalkMain(Activity activity, Map<String, String> map) {
        Log.i("Etalk","execute gotoEtalkMain!");
    }

    @Override
    public void gotoEtalkDetail(Activity activity, Map<String, String> map) {
        Log.i("Etalk","execute gotoEtalkDetail!");
    }

    @Override
    public Fragment getEtalkFramgent(Map<String, String> map) {
        Log.i("Etalk","execute getEtalkFramgent!");
        return null;
    }
}
