package com.example.verticalvideo.base.common.views.basesactivitiey;

import android.support.v7.app.AppCompatActivity;

import com.example.verticalvideo.base.common.presenters.MvpPresenter;
import com.example.verticalvideo.base.common.views.IMvpView;

public abstract class MvpActivity<P extends MvpPresenter> extends AppCompatActivity implements IMvpView {

}
