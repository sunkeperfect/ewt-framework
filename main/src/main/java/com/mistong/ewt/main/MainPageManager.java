package com.mistong.ewt.main;

import android.support.v4.app.Fragment;

import com.mistong.ewt.base.EWTBase;

/**
 * Created by sk on 2017/12/8.
 */

public class MainPageManager {

    private static  MainPageManager instance;
    private MainPageManager(){

    }
    public static MainPageManager getInstance(){
        if(instance==null){
            instance =new MainPageManager();

        }
        return instance;
    }


    public Fragment getEtalkFragment(){
        return EWTBase.getInstance().getEtalk().getEtalkFramgent(null);
    }
}
