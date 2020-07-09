package com.example.verticalvideo.ui.activities.vertical_video;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;

import com.example.verticalvideo.R;
import com.example.verticalvideo.base.mvp.views.baseactivity.MvpAppMvpActivity;
import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.models.verticalvideo.VerticalVideoModel;
import com.example.verticalvideo.ui.fragments.VideoFragment;
import com.example.verticalvideo.utils.LogHelper;

import java.util.Optional;

public class VerticalVideoActivity extends MvpAppMvpActivity<VerticalVideoPresenter> implements IVerticaVideoView {
    private static final String TAG = "VerticalVideoActivity";

    private RecyclerView recyclerView;

    private Optional<VerticalVideoPresenter> mVerticalVideoPresenter = Optional.of(new VerticalVideoPresenter());

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
        mVerticalVideoPresenter.ifPresent(presenter -> {
            presenter.bindView(this);
            presenter.setModel(new VerticalVideoModel());
        });
        initData();
    }

    @Override
    public void onSuccess(VideosInfoBean[] videosInfoList) {
        LogHelper.i(TAG, "onSuccess");
        mVideosInfoList = videosInfoList;
        initView();
    }

    @Override
    public void onFailed() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void getVideosInfoList() {
        mVerticalVideoPresenter.ifPresent(presenter -> {
            presenter.getVideosInfoList();
        });
    }

    private void createFragment() {
        Fragment currentFragmnet = new VideoFragment(mVideosInfoList);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, currentFragmnet);
        fragmentTransaction.commit();
    }
}