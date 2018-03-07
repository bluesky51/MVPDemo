package com.exam.sky.mvpdemo.model;

import com.exam.sky.mvpdemo.callback.OnGetDataListener;
import com.exam.sky.mvpdemo.http.HttpUtils;

/**
 * Created by bluesky on 16/10/24.
 */

public class FirstAcitivityModel implements IFirstAcitivityModel {
    OnGetDataListener mOnGetDataListener;

    public FirstAcitivityModel(OnGetDataListener mOnGetDataListener) {
        this.mOnGetDataListener = mOnGetDataListener;
    }

    @Override
    public void loadData() {
        HttpUtils httpUtils = HttpUtils.getHttpUtils();
        httpUtils.getListData("http://interfaces.ziroom.com/");
        httpUtils.setOnGetDataListener(mOnGetDataListener);
    }


}
