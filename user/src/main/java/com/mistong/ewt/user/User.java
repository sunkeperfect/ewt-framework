package com.mistong.ewt.user;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;

import com.mistong.ewt.base.EWTBase;
import com.mistong.ewt.base.common.BaseActivity;
import com.mistong.ewt.base.user.BaseUser;
import com.mistong.ewt.base.user.IUser;
import com.mistong.ewt.base.user.LoginCallback;
import com.mistong.ewt.base.user.UserInfo;
import com.mistong.ewt.user.view.LoginActivity;

import java.util.ArrayList;
import java.util.Map;

/**
 * BaseUser 模块对外的服务
 * Created by sk on 2017/11/27.
 */

public class User extends BaseUser {


    public static final String USER_LOGIN_CALLBACK_ACTION="com.mistong.ewt.user.USER_LOGIN_CALLBACK_ACTION";
    public ArrayList<LoginCallback> loginCallbackArrayList=new ArrayList<>();
    public User(){

        register();

    }

    /**
     * 管理回调
     */
    void register(){
        BroadcastReceiver broadcastReceiver= new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if(USER_LOGIN_CALLBACK_ACTION.equals(intent.getAction())){
                    for (LoginCallback loginCallback:loginCallbackArrayList){
                        if(loginCallback!=null)
                        loginCallback.callback(getUserInfo());
                    }
                }
            }
        };
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(USER_LOGIN_CALLBACK_ACTION);
        LocalBroadcastManager.getInstance(EWTBase.getInstance().getAppContext()).registerReceiver(broadcastReceiver,intentFilter);
    }

    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public void login(Activity activity, Map<String, String> extar, LoginCallback loginCallback) {
        Intent intent = new Intent(activity,LoginActivity.class);
        if(extar!=null&&extar.size()>0){
            for (String key:extar.keySet()){
                intent.putExtra(key,extar.get(key));
            }
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        loginCallbackArrayList.add(loginCallback);
    }


    @Override
    public UserInfo getUserInfo() {
        return UserManager.getInstance().getUserInfo();
    }


    @Override
    public void initComponent() {

    }

    @Override
    public void distroyComponent() {

    }

}
