package com.mistong.ewt.base;

import android.app.Activity;

/**
 * Created by sk on 2017/11/29.
 */

public interface IComponent {
    void initComponent();
    void start(Activity activity);
    void distroyComponent();
}
