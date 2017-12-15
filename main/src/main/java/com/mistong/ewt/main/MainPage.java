package com.mistong.ewt.main;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import com.mistong.ewt.base.main.BaseMainPage;
import com.mistong.ewt.main.view.MainActivity;

import java.util.Map;

/**
 * Created by sk on 2017/12/7.
 */

public class MainPage extends BaseMainPage {

    @Override
    public void start(Activity activity) {
        super.start(activity);
        Log.i(this.getClass().getSimpleName(),"execute start!");
        gotoMainPage(activity,null);

    }
    public void gotoMainPage(Activity activity, Map<String,String> extar){
        Log.i(this.getClass().getSimpleName(),"execute gotoMainPage!");

        Intent intent = new Intent(activity,MainActivity.class);
        if(extar!=null&&extar.size()>0){
            for (String key:extar.keySet()){
                intent.putExtra(key,extar.get(key));
            }
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

}
