package com.example.verticalvideo.ui.activities.vertical_video;

import com.example.verticalvideo.base.mvp.presenters.BaseMvpPresenter;
import com.example.verticalvideo.models.verticalvideo.IVerticalVideoModel;
import com.example.verticalvideo.models.verticalvideo.VerticalVideoMvpModel;
import com.example.verticalvideo.utils.LogHelper;

public class VerticalVideoPresenter extends BaseMvpPresenter<VerticalVideoContract.IVerticalVideoView> implements VerticalVideoContract.IVerticalVideoPresenter {
    private static final String TAG = "VerticalVideoPresenter";

    private IVerticalVideoModel mVerticalVideoModel;

    public VerticalVideoPresenter() {
        mVerticalVideoModel = new VerticalVideoMvpModel();
    }

    public void getVideosInfoList() {
        mVerticalVideoModel.getVideosInfoList((success, result, msg, throwable) -> {
            mView.ifPresent(view -> {
                if (success) {
                    view.updateVideoInfo(result);
                } else {
                    LogHelper.w(TAG, "getVideosInfoList: The msg is: " + msg);
                }
            });
        });
    }
}
