package com.example.verticalvideo.base.mvp.presenters;

import android.support.annotation.NonNull;

import com.example.verticalvideo.base.common.presenters.MvpPresenter;
import com.example.verticalvideo.base.mvp.models.IBaseMvpModel;
import com.example.verticalvideo.base.mvp.views.IBaseMvpView;

import java.util.Optional;

public abstract class BaseMvpPresenter<T extends IBaseMvpView, V extends IBaseMvpModel> extends MvpPresenter<T, V> {
    protected Optional<T> mView = Optional.empty();

    protected Optional<V> mModel = Optional.empty();

    public void bindView(@NonNull T view) {
        mView = Optional.of(view);
    }

    public void unbindView() {
        mView = Optional.empty();
    }

    public void setModel(@NonNull V model) {
        mModel = Optional.of(model);
    }
}
