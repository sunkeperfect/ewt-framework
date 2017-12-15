package com.mistong.ewt.ewt_framework;

import android.app.Application;
import android.util.Log;

import com.mistong.ewt.base.EWTBase;
import com.mistong.ewt.etalk.ETalk;
import com.mistong.ewt.main.MainPage;
import com.mistong.ewt.user.User;

/**
 * Created by sk on 2017/11/23.
 */

public class EwtApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 自动加载 各个模块的初始化方法
         */
        Log.i("EwtApplication","execute EwtApplication onCreate");

        EWTBase.getInstance().setAppContext(this);
        EWTBase.getInstance().setEtalk(new ETalk());
        EWTBase.getInstance().setUser(new User());
        EWTBase.getInstance().setMainPage(new MainPage());
        EWTBase.getInstance().init();

    }
}
