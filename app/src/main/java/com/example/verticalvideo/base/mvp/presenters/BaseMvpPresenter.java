package com.example.verticalvideo.base.mvp.presenters;

import android.support.annotation.NonNull;

import com.example.verticalvideo.base.common.presenters.MvpPresenter;
import com.example.verticalvideo.base.mvp.models.IBaseMvpModel;
import com.example.verticalvideo.base.mvp.views.IBaseMvpView;

import java.util.Optional;

public abstract class BaseMvpPresenter<V extends IBaseMvpView, M extends IBaseMvpModel> extends MvpPresenter<V, M> {
    protected Optional<V> mView = Optional.empty();

    protected Optional<M> mModel = Optional.empty();

    public void bindView(@NonNull V view) {
        mView = Optional.of(view);
    }

    public void unbindView() {
        mView = Optional.empty();
    }

    public void setmModel(@NonNull M model) {
        mModel = Optional.of(model);
    }
}
