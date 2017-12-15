package com.mistong.ewt.base.main;

import android.app.Activity;
import android.content.Context;

import com.mistong.ewt.base.IComponent;

import java.util.Map;

/**
 * Created by sk on 2017/11/29.
 */

public interface IMainPage extends IComponent {
    void gotoMainPage(Activity context, Map<String,String> extra);

}
