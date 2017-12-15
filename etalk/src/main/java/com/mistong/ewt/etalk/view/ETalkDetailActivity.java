package com.mistong.ewt.etalk.view;

import android.os.Bundle;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mistong.ewt.base.EWTBase;
import com.mistong.ewt.base.common.BaseActivity;
import com.mistong.ewt.base.user.LoginCallback;
import com.mistong.ewt.base.user.UserInfo;
import com.mistong.ewt.etalk.ETalkManager;
import com.mistong.ewt.etalk.R;

/**
 * Created by sk on 2017/11/23.
 */

public class ETalkDetailActivity extends BaseActivity implements View.OnClickListener
{
    TextView contentTv;
    TextView contentTv1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etalk_detail_activity);

        initView();

    }

    private void initView(){
        Button etalkUserInfoBTN=findViewById(R.id.etalk_userinfo_btn);
        contentTv=findViewById(R.id.content_tv);
        contentTv1=findViewById(R.id.content_tv1);
        etalkUserInfoBTN.setOnClickListener(this);
        Button loginBtn=findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.etalk_userinfo_btn){
            contentTv.setText(ETalkManager.getInstance().getUserInfo().toString());
        }else if(view.getId()==R.id.login_btn){
            EWTBase.getInstance().getUser().login(this, null, new LoginCallback() {
                @Override
                public void callback(UserInfo userInfo) {
                    contentTv1.setText(userInfo.toString());
                }

                @Override
                public void success(UserInfo userInfo) {

                }
            });
        }


    }
}
