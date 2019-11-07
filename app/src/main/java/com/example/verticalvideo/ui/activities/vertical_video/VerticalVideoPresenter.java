package com.example.verticalvideo.ui.activities.vertical_video;

import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.models.verticalvideo.IVerticalVideoModel;
import com.example.verticalvideo.utils.LogHelper;

public class VerticalVideoPresenter extends VerticalVideoContract.Presenter<IVerticaVideoView, IVerticalVideoModel> {
    private static final String TAG = "VerticalVideoPresenter";

    private IVerticalVideoModel.VideosInfoListCallBack videosInfoListCallBack =
        new IVerticalVideoModel.VideosInfoListCallBack() {
        @Override
        public void onSuccess(VideosInfoBean[] videosInfoList) {
            mView.ifPresent(view -> {
                view.onSuccess(videosInfoList);
            });
        }

        @Override
        public void onError() {
            mView.ifPresent(view -> {
                view.onFailed();
            });
        }
    };

    public void getVideosInfoList() {
        mModel.ifPresent(model -> {
            model.getVideosInfoList(videosInfoListCallBack);
        });
    }
}
