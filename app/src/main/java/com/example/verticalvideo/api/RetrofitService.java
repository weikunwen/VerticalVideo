package com.example.verticalvideo.api;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("/feed_content/content/list/1")
    Flowable<BaseResponse<Object>> getVideosInfo ();
}
