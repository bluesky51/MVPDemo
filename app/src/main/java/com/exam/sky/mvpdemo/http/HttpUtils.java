package com.exam.sky.mvpdemo.http;

import com.exam.sky.mvpdemo.bean.HotData;
import com.exam.sky.mvpdemo.callback.GetData;
import com.exam.sky.mvpdemo.callback.OnGetDataListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bluesky on 16/10/24.
 */

public class HttpUtils {
    private static HttpUtils httpUtils = null;

     OnGetDataListener onGetDataListener;
    public  static HttpUtils getHttpUtils() {
        if (httpUtils == null) {
            httpUtils = new HttpUtils();
        }
        return httpUtils;
    }

    public void setOnGetDataListener(OnGetDataListener onGetDataListener) {
        this.onGetDataListener = onGetDataListener;
    }


    public void getListData(String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
         GetData data = retrofit.create(GetData.class);
        Call<HotData> call = data.getHotListData();
        call.enqueue(new Callback<HotData>() {
            @Override
            public void onResponse(Call<HotData> call, Response<HotData> response) {
                HotData hotDatas = response.body();
                System.out.println(hotDatas);
                if (onGetDataListener != null) {
                    onGetDataListener.onSucessGetDataListener(hotDatas);
                }
            }

            @Override
            public void onFailure(Call<HotData> call, Throwable t) {
                if (onGetDataListener != null) {
                    onGetDataListener.onFailGetDataListener(t.getMessage());
                }
            }
        });
    }
}
