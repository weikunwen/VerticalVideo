package com.example.verticalvideo.api;

import com.example.verticalvideo.beans.VideosInfoBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface IRetrofitService {
    @GET("feed_content/content/list/1")
    Flowable<BaseResponseI<VideosInfoBean[]>> getVideoListInfo();
}
