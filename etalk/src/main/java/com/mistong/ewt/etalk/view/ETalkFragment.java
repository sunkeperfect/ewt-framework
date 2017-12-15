package com.mistong.ewt.etalk.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.mistong.ewt.etalk.ETalkManager;
import com.mistong.ewt.etalk.R;

/**
 * Created by sk on 2017/12/7.
 */

public class ETalkFragment extends Fragment {


    

    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.etalk_fragment, container, false);
        button=view.findViewById(R.id.etalk_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETalkManager.getInstance().gotoEtalkMain(getActivity(),null);
            }
        });
        return view;
    }
}
