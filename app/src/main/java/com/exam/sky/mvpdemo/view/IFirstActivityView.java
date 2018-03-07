package com.exam.sky.mvpdemo.view;

import com.exam.sky.mvpdemo.bean.HotData;

/**
 * Created by bluesky on 16/10/24.
 */

public interface IFirstActivityView {
    void setData(HotData hotData);
    void setFailMessage(String error);
}
