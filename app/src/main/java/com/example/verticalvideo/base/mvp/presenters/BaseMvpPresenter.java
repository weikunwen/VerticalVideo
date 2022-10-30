package com.example.verticalvideo.base.mvp.presenters;

import androidx.annotation.NonNull;

import com.example.verticalvideo.base.common.presenters.MvpPresenter;
import com.example.verticalvideo.base.mvp.views.IBaseMvpView;

import java.util.Optional;

public abstract class BaseMvpPresenter<T extends IBaseMvpView> extends MvpPresenter<T> {
    protected Optional<T> mView = Optional.empty();

    public void bindView(@NonNull T view) {
        mView = Optional.of(view);
    }

    public void unbindView() {
        mView = Optional.empty();
    }
}
