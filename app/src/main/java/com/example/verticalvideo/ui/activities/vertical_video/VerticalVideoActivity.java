package com.example.verticalvideo.ui.activities.vertical_video;

import android.os.Bundle;

import com.example.verticalvideo.R;
import com.example.verticalvideo.base.mvp.views.baseactivity.MvpAppMvpActivity;

public class VerticalVideoActivity<P extends VerticalVideoContract.Presenter> extends MvpAppMvpActivity<P>
    implements IVerticaVideoView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {

    }
}
