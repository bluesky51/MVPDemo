package com.exam.sky.mvpdemo.presenter;

import android.util.Log;

import com.exam.sky.mvpdemo.bean.HotData;
import com.exam.sky.mvpdemo.callback.OnGetDataListener;
import com.exam.sky.mvpdemo.model.FirstAcitivityModel;
import com.exam.sky.mvpdemo.model.IFirstAcitivityModel;
import com.exam.sky.mvpdemo.view.IFirstActivityView;

/**
 * Created by bluesky on 16/10/24.
 */

public class FirstActivityPresenter implements OnGetDataListener {
    IFirstActivityView iFirstActivityView;
    IFirstAcitivityModel iFirstAcitivityModel;

    public FirstActivityPresenter(IFirstActivityView iFirstActivityView) {
        Log.e("======", "=FirstActivityPresenter=====");
        this.iFirstActivityView = iFirstActivityView;
        iFirstAcitivityModel = new FirstAcitivityModel(this);
    }

    public void getListData() {
        iFirstAcitivityModel.loadData();
    }

    @Override
    public void onSucessGetDataListener(HotData hotData) {
        iFirstActivityView.setData(hotData);
    }

    @Override
    public void onFailGetDataListener(String errorMessage) {
        iFirstActivityView.setFailMessage(errorMessage);
    }
}
