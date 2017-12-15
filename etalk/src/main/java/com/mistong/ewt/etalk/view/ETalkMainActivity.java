package com.mistong.ewt.etalk.view;

import android.os.Bundle;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.mistong.ewt.base.common.BaseActivity;
import com.mistong.ewt.etalk.ETalkManager;
import com.mistong.ewt.etalk.R;

/**
 * Created by sk on 2017/11/23.
 */

public class ETalkMainActivity extends BaseActivity implements View.OnClickListener{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etalk_main_activity);
        initView();
    }
    private void initView(){
       Button mEtalkOpenDetailBTN =findViewById(R.id.etalk_open_detail_btn);
        mEtalkOpenDetailBTN.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.etalk_open_detail_btn){
            ETalkManager.getInstance().gotoEtalkDetail(this,null);
        }
    }
}
