package com.mistong.ewt.ewt_framework;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.mistong.annotation.MainModule;
import com.mistong.ewt.base.EWTBase;
import com.mistong.ewt.user.User;


/**
 * Created by sk on 2017/11/27.
 */
@MainModule
public class StartActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EWTBase.getInstance().start(this);
        finish();
    }
}
