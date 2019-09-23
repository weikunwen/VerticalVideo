package com.example.verticalvideo.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.verticalvideo.R;
import com.example.verticalvideo.base.common.views.basefragment.MvpFragment;

public class VideoFragment extends MvpFragment {
    private static final String TAG = "VideoFragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate is invoked.");
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
}
