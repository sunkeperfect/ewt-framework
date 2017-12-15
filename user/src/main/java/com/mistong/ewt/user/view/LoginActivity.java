package com.mistong.ewt.user.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.widget.Button;

import com.mistong.ewt.base.EWTBase;
import com.mistong.ewt.base.common.BaseActivity;
import com.mistong.ewt.user.R;
import com.mistong.ewt.user.User;

/**
 * Created by sk on 2017/11/27.
 */

public class LoginActivity extends BaseActivity {
    Button loginBtn;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login_activity);
        loginBtn=findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(User.USER_LOGIN_CALLBACK_ACTION);
                LocalBroadcastManager.getInstance(EWTBase.getInstance().getAppContext()).
                        sendBroadcast(intent);
                finish();
            }
        });
    }
}
