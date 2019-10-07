package com.example.verticalvideo.api;

import com.example.verticalvideo.beans.VideosInfoBean;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("feed_content/content/list/1")
    Call<BaseResponse<VideosInfoBean[]>> getVideoListInfo();
}
