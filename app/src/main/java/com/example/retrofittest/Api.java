package com.example.retrofittest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2017/11/15.
 */

public interface Api {

    @GET("api/data/Android/10/1")
    Call<ResponseBody> getAndroidInfo();
}
