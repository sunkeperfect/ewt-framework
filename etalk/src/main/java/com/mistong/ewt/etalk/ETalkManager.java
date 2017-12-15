package com.mistong.ewt.etalk;


import android.app.Activity;
import android.support.v4.content.LocalBroadcastManager;

import com.mistong.annotation.MainModule;
import com.mistong.ewt.base.EWTBase;
import com.mistong.ewt.base.common.BaseActivity;
import com.mistong.ewt.base.user.IUser;
import com.mistong.ewt.base.user.LoginCallback;
import com.mistong.ewt.base.user.UserInfo;

import java.util.Map;

/**
 * 外部 内部跳转 调用 管理
 * Created by sk on 2017/11/27.
 */

public class ETalkManager {


    private ETalkManager(){

    }

    private static ETalkManager mEtalkRouter;
    public static ETalkManager getInstance(){
        if(mEtalkRouter==null){
            mEtalkRouter=new ETalkManager();
        }
        return mEtalkRouter;
    }

    /**
     * 跳转到首页
     * @param activity
     * @param extra
     */
    public void gotoEtalkMain(Activity activity, Map<String,String> extra){
        /**
         *
         */
        EWTBase.getInstance().getEtalk().gotoEtalkMain(activity,extra);
    }
    /**
     *
     *
     */
   public void gotoEtalkDetail(Activity activity,Map<String,String> extra){
       EWTBase.getInstance().getEtalk().gotoEtalkDetail(activity,extra);
   }

    /**
     * 跳转到登录
     * @param activity
     * @param extra
     */
    public void gotoLogin(Activity activity, Map<String,String> extra, LoginCallback loginCallback){
        EWTBase.getInstance().getUser().login(activity,extra,loginCallback);
    }

    /**
     *数据可以是 Json 但是目前项目小没这个必要
     *直接使用Base的model 会节省很多转换成本和理解成本。
     *
     */
    public UserInfo getUserInfo(){
        return  EWTBase.getInstance().getUser().getUserInfo();
    }



}
