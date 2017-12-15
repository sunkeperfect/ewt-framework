package com.mistong.ewt.base.user;

/**
 * Created by sk on 2017/11/23.
 */

public class UserInfo {
    String userToken;
    String phoneNumber;
    String imgUrl;

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userToken='" + userToken + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
