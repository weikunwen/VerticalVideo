package com.example.verticalvideo.base.mvp.views.baseactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.verticalvideo.base.mvp.presenters.BaseMvpPresenter;
import com.example.verticalvideo.base.mvp.views.BaseMvpView;

public class BaseAppMvpActivity<V extends BaseMvpView, P extends BaseMvpPresenter<V>> extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
