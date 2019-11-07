package com.example.verticalvideo.ui.activities.vertical_video;

import com.example.verticalvideo.beans.VideosInfoBean;

public interface IVerticaVideoView extends VerticalVideoContract.IBaseView{
    void onSuccess(VideosInfoBean[] videosInfoList);
    void onFailed();
}
