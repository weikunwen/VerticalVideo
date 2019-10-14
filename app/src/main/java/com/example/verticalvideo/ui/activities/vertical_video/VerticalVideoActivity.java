package com.example.verticalvideo.ui.activities.vertical_video;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.verticalvideo.R;
import com.example.verticalvideo.api.BaseResponse;
import com.example.verticalvideo.api.RetrofitService;
import com.example.verticalvideo.base.mvp.views.baseactivity.MvpAppMvpActivity;
import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.ui.fragments.VideoFragment;
import com.example.verticalvideo.utils.LogHelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VerticalVideoActivity<P extends VerticalVideoContract.Presenter> extends MvpAppMvpActivity<P>
    implements IVerticaVideoView {
    private static final String TAG = "VerticalVideoActivity";

    private static final int MSG_GET_VIDEOS_INFO_LIST = 100;

    private VideosInfoBean[] mVideosInfoList;

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        getVideosInfoList();
    }

    @Override
    public void initView() {
        createFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogHelper.i(TAG, "onCreate is invoked.");
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void getVideosInfoList() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://114.67.81.61/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitService retrofitService = retrofit.create(RetrofitService.class);
        Call<BaseResponse<VideosInfoBean[]>> call = retrofitService.getVideoListInfo();
        call.enqueue(new Callback<BaseResponse<VideosInfoBean[]>>() {
            @Override
            public void onResponse(Call<BaseResponse<VideosInfoBean[]>> call, Response<BaseResponse<VideosInfoBean[]>> response) {
                LogHelper.i(TAG, "getVideosInfoList onResponse");
                if((response.body().getCode() == 0) && ("成功".equals(response.body().getMessage()))) {
                    mVideosInfoList = response.body().getData();
                    if ((mVideosInfoList != null) && mVideosInfoList.length != 0) {
                        UiHandler uiHandler = new UiHandler();
                        Message message = Message.obtain();
                        message.what = MSG_GET_VIDEOS_INFO_LIST;
                        uiHandler.sendMessage(message);
                    }
                }
            }

            @Override
            public void onFailure(Call<BaseResponse<VideosInfoBean[]>> call, Throwable t) {
                LogHelper.e(TAG, "getVideosInfoList onFailure: " + t.getMessage());
            }
        });
    }

    private void createFragment() {
        Fragment currentFragmnet = new VideoFragment(mVideosInfoList);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, currentFragmnet);
        fragmentTransaction.commit();
    }

    public class UiHandler extends Handler {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == MSG_GET_VIDEOS_INFO_LIST) {
                initView();
            }
        }
    }
}
