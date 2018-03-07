package com.exam.sky.mvpdemo.callback;

import com.exam.sky.mvpdemo.bean.HotData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by bluesky on 16/10/24.
 */

public interface GetData {
    @Headers({"User-Agent: Apache-HttpClient/UNAVAILABLE (java 1.4)"})
    @GET(value ="index.php?_p=api&_a=carousel")
    Call<HotData> getHotListData();

}
