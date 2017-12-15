package com.mistong.ewt.base;

import com.mistong.ewt.base.etalk.IEtalk;
import com.mistong.ewt.base.main.IMainPage;
import com.mistong.ewt.base.user.IUser;

import java.util.Map;

/**
 * Created by sk on 2017/11/29.
 */

public class EWTBaseManager {

    private EWTBaseManager(){

    }
    private static EWTBaseManager instance;
    public static EWTBaseManager  getInstance(){
        if(instance==null){
            instance=new EWTBaseManager();
        }
        return instance;
    }

    private IUser user;
    private IMainPage mainPage;
    private IEtalk etalk;
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

    public IEtalk getEtalk() {
        return etalk;
    }

    public void setEtalk(IEtalk etalk) {
        this.etalk = etalk;
    }
}
