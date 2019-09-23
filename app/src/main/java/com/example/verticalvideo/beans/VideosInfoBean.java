package com.example.verticalvideo.beans;

import java.util.List;

public class VideosInfoBean {
    private int videoId;
    private String videoType;
    private List<VideoBaseInfoBean> videoBaseListInfo;
    private List<VideoAuthorInfoBean> videoAuthorListInfo;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public List<VideoBaseInfoBean> getVideoBaseListInfo() {
        return videoBaseListInfo;
    }

    public void setVideoBaseListInfo(List<VideoBaseInfoBean> videoBaseListInfo) {
        this.videoBaseListInfo = videoBaseListInfo;
    }

    public List<VideoAuthorInfoBean> getVideoAuthorListInfo() {
        return videoAuthorListInfo;
    }

    public void setVideoAuthorListInfo(List<VideoAuthorInfoBean> videoAuthorListInfo) {
        this.videoAuthorListInfo = videoAuthorListInfo;
    }
}
