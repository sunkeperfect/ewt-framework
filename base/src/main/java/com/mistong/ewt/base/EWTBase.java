package com.mistong.ewt.base;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;

import com.mistong.annotation.BaseProcessor;
import com.mistong.ewt.base.etalk.BaseEtalk;
import com.mistong.ewt.base.etalk.IEtalk;
import com.mistong.ewt.base.main.BaseMainPage;
import com.mistong.ewt.base.main.IMainPage;
import com.mistong.ewt.base.user.BaseUser;
import com.mistong.ewt.base.user.IUser;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by sk on 2017/11/29.
 */

public class EWTBase {
    private static EWTBase instance;

    public static EWTBase getInstance(){

        if(instance==null){
            instance=new EWTBase();
        }
        return instance;
    }

    Context appContext;
    /**
     * E讲堂 组件
     */
    IEtalk etalk;
    /**
     * 用户 组件
     */
    IUser  user;
    /**
     * 主页 组件
     */
    IMainPage mainPage;

    List<IComponent> componentList=new ArrayList<>();

    public IEtalk getEtalk() {
        return etalk;
    }

    public void setEtalk(IEtalk etalk) {
        this.etalk = etalk;
    }

    public IUser getUser() {
        return user;
    }

    public void setUser(IUser user) {
        this.user = user;
    }

    public IMainPage getMainPage() {
        return mainPage;
    }

    public void setMainPage(IMainPage mainPage) {
        this.mainPage = mainPage;
    }

    public Context getAppContext() {
        return appContext;
    }
    public void setAppContext(Context context){
        this.appContext=context;
    }
    /**
     **
     * 初始化所有模块组件
     */
    public  void init(){

        if(etalk==null) {
            etalk = new BaseEtalk();
        }
        if(user==null){
            user=new BaseUser();
        }
        if(mainPage==null){
            mainPage=new BaseMainPage();
        }
        componentList.add(etalk);
        componentList.add(user);
        componentList.add(mainPage);
        for (IComponent component :componentList){
            component.initComponent();
        }
    }
    public void start(Activity activity){
        for (IComponent component :componentList){
            component.start(activity);
        }
    }
    public static void distroy(){

    }

}
