package com.example.verticalvideo.api;

import com.example.verticalvideo.beans.VideosInfoBean;

import io.reactivex.Flowable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("feed_content/content/list/1")
    Flowable<BaseResponse<VideosInfoBean[]>> getVideoListInfo();
}
