package com.example.verticalvideo.ui.fragments;

import com.example.verticalvideo.base.mvp.models.IBaseMvpModel;
import com.example.verticalvideo.base.mvp.presenters.BaseMvpPresenter;
import com.example.verticalvideo.base.mvp.views.IBaseMvpView;
import com.example.verticalvideo.ui.activities.vertical_video.VerticalVideoContract;

public class VideoContract {
    public interface IBaseView extends IBaseMvpView {
    }

    public interface IBaseModel extends IBaseMvpModel {
    }

    public abstract static class Presenter<V extends VerticalVideoContract.IBaseView,
        M extends VerticalVideoContract.IBaseModel> extends BaseMvpPresenter<V, M> {
    }
}
