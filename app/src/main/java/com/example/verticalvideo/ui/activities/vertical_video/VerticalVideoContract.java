package com.example.verticalvideo.ui.activities.vertical_video;

import com.example.verticalvideo.base.mvp.presenters.IBaseMvpPresenter;
import com.example.verticalvideo.base.mvp.views.IBaseMvpView;
import com.example.verticalvideo.beans.VideosInfoBean;

public class VerticalVideoContract {
    public interface IVerticalVideoView extends IBaseMvpView {
        void updateVideoInfo(VideosInfoBean[] videosInfoList);
    }

    public interface IVerticalVideoPresenter extends IBaseMvpPresenter {
        void getVideosInfoList();
    }
}
