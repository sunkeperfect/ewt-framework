package com.mistong.ewt.base.user;

/**
 * Created by sk on 2017/12/7.
 */

public interface LoginCallback {
    void callback(UserInfo userInfo);
    void  success(UserInfo userInfo);

}
