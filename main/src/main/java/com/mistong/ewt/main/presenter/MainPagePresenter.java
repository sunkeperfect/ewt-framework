package com.mistong.ewt.main.presenter;

import com.mistong.ewt.main.MainPageManager;
import com.mistong.ewt.main.view.IMainPageView;

/**
 * Created by sk on 2017/12/8.
 */

public class MainPagePresenter {
    IMainPageView iMainPageView;
    public MainPagePresenter(IMainPageView iMainPageView){
        this.iMainPageView=iMainPageView;
        setFragment();
    }


    public void setFragment(){
        iMainPageView.setFragment(
                MainPageManager.getInstance().getEtalkFragment());
    }
}
