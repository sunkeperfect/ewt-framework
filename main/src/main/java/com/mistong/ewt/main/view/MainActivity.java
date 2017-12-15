package com.mistong.ewt.main.view;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.mistong.ewt.base.common.BaseActivity;
import com.mistong.ewt.main.MainPageManager;
import com.mistong.ewt.main.R;
import com.mistong.ewt.main.presenter.MainPagePresenter;

/**
 * Created by sk on 2017/11/27.
 */

public class MainActivity extends BaseActivity implements  IMainPageView{

    MainPagePresenter pagePresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(this.getClass().getSimpleName(),"execute onCreate!");
        setContentView(R.layout.main_activity);
         pagePresenter=new MainPagePresenter(this);

    }

    @Override
    public void setFragment(Fragment fragment) {



        getSupportFragmentManager().beginTransaction().
                add(R.id.main_group_ll, MainPageManager.getInstance().getEtalkFragment()).
                commitAllowingStateLoss();

    }
}

