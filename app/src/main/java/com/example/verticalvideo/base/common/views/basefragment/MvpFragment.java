package com.example.verticalvideo.base.common.views.basefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.example.verticalvideo.base.common.presenters.MvpPresenter;
import com.example.verticalvideo.base.common.views.IMvpView;

public abstract class MvpFragment<P extends MvpPresenter> extends Fragment implements IMvpView {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public abstract int getContentViewId();

    public abstract void initData();

    public abstract void initView();
}
