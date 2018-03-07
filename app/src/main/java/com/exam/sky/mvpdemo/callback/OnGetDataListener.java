package com.exam.sky.mvpdemo.callback;

import com.exam.sky.mvpdemo.bean.HotData;

/**
 * Created by bluesky on 16/10/24.
 */

public interface OnGetDataListener {
    void onSucessGetDataListener( HotData hotData);
    void onFailGetDataListener( String errorMessage);
}
