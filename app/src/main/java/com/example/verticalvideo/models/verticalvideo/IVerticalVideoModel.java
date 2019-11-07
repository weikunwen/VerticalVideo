package com.example.verticalvideo.models.verticalvideo;

import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.ui.activities.vertical_video.VerticalVideoContract;

public interface IVerticalVideoModel extends VerticalVideoContract.IBaseModel {
    void getVideosInfoList(VideosInfoListCallBack videosInfoListCallBack);

    interface VideosInfoListCallBack {
        void onSuccess(VideosInfoBean[] videosInfoList);
        void onError();
    }
}
