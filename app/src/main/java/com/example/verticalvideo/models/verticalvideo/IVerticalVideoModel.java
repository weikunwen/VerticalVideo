package com.example.verticalvideo.models.verticalvideo;

import com.example.verticalvideo.api.IResponseListener;
import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.ui.activities.vertical_video.VerticalVideoContract;

public interface IVerticalVideoModel {
    void getVideosInfoList( IResponseListener<VideosInfoBean[]> listener);
}
