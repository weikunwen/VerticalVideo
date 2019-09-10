package com.example.verticalvideo.base.mvp.presenters;

import com.example.verticalvideo.base.common.presenters.MvpPresenter;
import com.example.verticalvideo.base.mvp.models.IBaseMvpModel;
import com.example.verticalvideo.base.mvp.views.IBaseMvpView;

public class BaseMvpPresenter<V extends IBaseMvpView, M extends IBaseMvpModel> extends MvpPresenter<V, M> {
}
