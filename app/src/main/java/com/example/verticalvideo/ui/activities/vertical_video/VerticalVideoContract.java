package com.example.verticalvideo.ui.activities.vertical_video;

import com.example.verticalvideo.base.mvp.models.IBaseMvpModel;
import com.example.verticalvideo.base.mvp.presenters.BaseMvpPresenter;
import com.example.verticalvideo.base.mvp.views.IBaseMvpView;

public class VerticalVideoContract {
    public interface IBaseView extends IBaseMvpView {
    }

    public interface IBaseModel extends IBaseMvpModel {
    }

    public abstract static class Presenter<T extends VerticalVideoContract.IBaseView,
        V extends VerticalVideoContract.IBaseModel> extends BaseMvpPresenter<T, V> {
    }
}
