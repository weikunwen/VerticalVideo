package com.example.verticalvideo.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.verticalvideo.R;
import com.example.verticalvideo.api.BaseResponse;
import com.example.verticalvideo.api.RetrofitService;
import com.example.verticalvideo.base.common.views.basefragment.MvpFragment;
import com.example.verticalvideo.beans.VideoListInfoBean;
import com.example.verticalvideo.beans.VideosInfoBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VideoFragment extends MvpFragment {
    private static final String TAG = "VideoFragment";

    private RetrofitService retrofitService;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate is invoked.");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://114.67.81.61/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitService = retrofit.create(RetrofitService.class);
        getVideosInfoList();
    }

    @Override
    public int getContentViewId() {
        return R.layout.fragment_show_video;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {

    }

    private void getVideosInfoList() {
        Call<BaseResponse<VideosInfoBean[]>> call = retrofitService.getVideoListInfo();
        call.enqueue(new Callback<BaseResponse<VideosInfoBean[]>>() {
            @Override
            public void onResponse(Call<BaseResponse<VideosInfoBean[]>> call, Response<BaseResponse<VideosInfoBean[]>> response) {
                Log.i(TAG, "getVideosInfoList onResponse");
                if((response.body().getCode() == 0) && ("成功".equals(response.body().getMessage()))) {
                    VideosInfoBean[] videosInfoBean = response.body().getData();
                    if ((videosInfoBean == null) || (videosInfoBean.length == 0)) {
                        Log.e(TAG, "videosInfoBean is null");
                    } else {
                        Log.i(TAG, "publish time: " + videosInfoBean[0].getVideoType());
                    }
                }
            }

            @Override
            public void onFailure(Call<BaseResponse<VideosInfoBean[]>> call, Throwable t) {
                Log.e(TAG, "getVideosInfoList onFailure: " + t.getMessage());
            }
        });
    }
}
