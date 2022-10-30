package com.example.verticalvideo.ui.activities.vertical_video;

import com.example.verticalvideo.base.mvp.presenters.BaseMvpPresenter;
import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.models.verticalvideo.IVerticalVideoModel;
import com.example.verticalvideo.models.verticalvideo.VerticalVideoModel;

public class VerticalVideoPresenter extends BaseMvpPresenter<VerticalVideoContract.IVerticalVideoView> implements VerticalVideoContract.IVerticalVideoPresenter {
    private static final String TAG = "VerticalVideoPresenter";

    private IVerticalVideoModel mVerticalVideoModel;

    public VerticalVideoPresenter() {
        mVerticalVideoModel = new VerticalVideoModel();
    }

//    private IVerticalVideoModel.VideosInfoListCallBack videosInfoListCallBack =
//        new IVerticalVideoModel.VideosInfoListCallBack() {
//        @Override
//        public void onSuccess(VideosInfoBean[] videosInfoList) {
//            mView.ifPresent(view -> {
//                view.onSuccess(videosInfoList);
//            });
//        }
//
//        @Override
//        public void onError() {
//            mView.ifPresent(view -> {
//                view.onFailed();
//            });
//        }
//    };

    public void getVideosInfoList() {
        mVerticalVideoModel.getVideosInfoList((success, result, msg, throwable) -> {
            mView.ifPresent(view -> {
                if (success) {

                } else {

                }
            });
        });
    }
}
