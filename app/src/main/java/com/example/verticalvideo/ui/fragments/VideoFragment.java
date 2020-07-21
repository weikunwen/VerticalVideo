package com.example.verticalvideo.ui.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.verticalvideo.R;
import com.example.verticalvideo.base.common.views.basefragment.MvpFragment;
import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.ui.adapters.VideoAdapter;
import com.example.verticalvideo.utils.LogHelper;

public class VideoFragment extends MvpFragment {
    private static final String TAG = "VideoFragment";

    private VideosInfoBean[] mVideosInfoList;

    private RecyclerView mVideosRecyclerView;

    private VideoAdapter mVideoAdapter;

    public VideoFragment(VideosInfoBean[] videosInfoList) {
        mVideosInfoList = videosInfoList;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogHelper.i(TAG, "onCreate is invoked.");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
        @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        initView(view);
        return view;
    }

    @Override
    public int getContentViewId() {
        return R.layout.fragment_show_video;
    }

    @Override
    public void onPause() {
        super.onPause();

    }

    public void initData() {
    }

    public void initView(View view) {
        mVideosRecyclerView = view.findViewById(R.id.show_video_rv);
        mVideoAdapter = new VideoAdapter(getActivity(), mVideosInfoList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mVideosRecyclerView.setLayoutManager(linearLayoutManager);
        mVideosRecyclerView.setAdapter(mVideoAdapter);
    }
}
