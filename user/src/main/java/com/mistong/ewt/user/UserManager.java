package com.mistong.ewt.user;

import android.app.Activity;

import com.mistong.ewt.base.EWTBase;
import com.mistong.ewt.base.user.LoginCallback;
import com.mistong.ewt.base.user.UserInfo;

import java.util.Map;

/**
 * Created by sk on 2017/11/27.
 */

public class UserManager {

    private UserManager(){

    }
    private static UserManager mUserManager;
    public static UserManager getInstance(){
        if(mUserManager==null){
            mUserManager=new UserManager();
        }
        return mUserManager;
    }

    public void login(Activity activity, Map<String,String> extra, LoginCallback loginCallback){
        EWTBase.getInstance().getUser().login(activity,extra,loginCallback);
    }
    public UserInfo getUserInfo(){
        //获取用信息的具体实现
        UserInfo userInfo=new UserInfo();
        userInfo.setImgUrl("xxx");
        userInfo.setPhoneNumber("13999999999");
        userInfo.setUserToken("xsasdaxasdsdasdqweqdsa123dsas1");
        return userInfo;
    }

}
