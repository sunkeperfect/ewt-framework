package com.mistong.ewt.etalk;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.mistong.ewt.base.etalk.BaseEtalk;

import com.mistong.ewt.etalk.view.ETalkDetailActivity;
import com.mistong.ewt.etalk.view.ETalkFragment;
import com.mistong.ewt.etalk.view.ETalkMainActivity;


import java.util.Map;

/**
 *
 * Created by sk on 2017/11/23.
 */

public class ETalk extends BaseEtalk{

    @Override
    public void initComponent() {
        super.initComponent();
    }

    @Override
    public void gotoEtalkMain(Activity activity, Map<String, String> map) {
        Intent intent=new Intent(activity, ETalkMainActivity.class);
        if(map!=null&&map.size()>0){
            for (String key:map.keySet()){
                intent.putExtra(key,map.get(key));
            }
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        activity.startActivity(intent);
    }

    @Override
    public void gotoEtalkDetail(Activity context, Map<String, String> map) {
        Intent intent = new Intent(context,ETalkDetailActivity.class);
        if(map!=null&&map.size()>0){
            for (String key:map.keySet()){
                intent.putExtra(key,map.get(key));
            }
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public Fragment getEtalkFramgent(Map<String, String> map) {
        return new ETalkFragment();
    }
}
