package com.mistong.ewt.base.etalk;

import android.app.Activity;
import android.support.v4.app.Fragment;


import com.mistong.ewt.base.IComponent;

import java.util.Map;

/**
 *
 * Created by sk on 2017/11/23.
 */

public interface IEtalk extends IComponent {
    /**
     *  跳转到E讲堂首页
     * @param map
     */
    void gotoEtalkMain(Activity activity,Map<String,String> map);

    /**
     *跳转到E讲堂详情
     * @param map
     */
    void gotoEtalkDetail(Activity activity,Map<String, String> map);

    /**
     * 获取E讲堂Fragment
     * @param map
     * @return
     */
    Fragment getEtalkFramgent(Map<String,String> map);


}
