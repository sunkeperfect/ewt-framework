package com.mistong.ewt.base.user;

import android.app.Activity;

import com.mistong.ewt.base.IComponent;
import com.mistong.ewt.base.common.BaseActivity;

import java.util.Map;

/**
 *
 * 用户组件
 * Created by  sk on 2017/11/23.
 *
 */

public interface IUser extends IComponent {
    /**
     * 是否已经登录
     * @return
     */
     boolean isLogin();
    /**
     * 登录
     */
    void login(Activity activity, Map<String,String> extar,LoginCallback loginCallback);


    /**
     * 返回用户信息
     * @return
     */
    UserInfo getUserInfo();


}
