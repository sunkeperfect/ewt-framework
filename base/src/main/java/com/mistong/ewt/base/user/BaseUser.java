package com.mistong.ewt.base.user;

import android.app.Activity;

import com.mistong.ewt.base.common.BaseActivity;

import java.util.Map;

/**
 * Created by sk on 2017/11/30.
 *
 *
 */

public class BaseUser implements IUser {
    @Override
    public void initComponent() {

    }

    @Override
    public void start(Activity activity) {

    }

    @Override
    public void distroyComponent() {

    }

    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public void login(Activity activity, Map<String, String> extar,LoginCallback loginCallback) {

    }



    @Override
    public UserInfo getUserInfo() {
        return null;
    }
}
