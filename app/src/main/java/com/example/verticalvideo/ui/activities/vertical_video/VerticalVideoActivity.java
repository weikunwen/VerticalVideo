package com.example.verticalvideo.ui.activities.vertical_video;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.verticalvideo.R;
import com.example.verticalvideo.base.mvp.views.baseactivity.MvpAppMvpActivity;
import com.example.verticalvideo.ui.fragments.VideoFragment;

public class VerticalVideoActivity<P extends VerticalVideoContract.Presenter> extends MvpAppMvpActivity<P>
    implements IVerticaVideoView {

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {
        createFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createFragment();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void createFragment() {
        Fragment currentFragmnet = new VideoFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, currentFragmnet);
        fragmentTransaction.commit();
    }
}
