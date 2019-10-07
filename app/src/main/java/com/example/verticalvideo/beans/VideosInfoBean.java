package com.example.verticalvideo.beans;

public class VideosInfoBean {
    private long videoId;
    private int videoType;
    private VideoBaseInfoBean videoBaseInfo;
    private VideoAuthorInfoBean videoAuthorInfo;
    private String videoPublishTime;

    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    public int getVideoType() {
        return videoType;
    }

    public void setVideoType(int videoType) {
        this.videoType = videoType;
    }

    public VideoBaseInfoBean getVideoBaseInfo() {
        return videoBaseInfo;
    }

    public void setVideoBaseInfo(VideoBaseInfoBean videoBaseInfo) {
        this.videoBaseInfo = videoBaseInfo;
    }

    public VideoAuthorInfoBean getVideoAuthorInfo() {
        return videoAuthorInfo;
    }

    public void setVideoAuthorInfo(VideoAuthorInfoBean videoAuthorInfo) {
        this.videoAuthorInfo = videoAuthorInfo;
    }

    public String getVideoPublishTime() {
        return videoPublishTime;
    }

    public void setVideoPublishTime(String videoPublishTime) {
        this.videoPublishTime = videoPublishTime;
    }
}
