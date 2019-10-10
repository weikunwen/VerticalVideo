package com.example.verticalvideo.beans;

public class VideosInfoBean {
    private long id;
    private int type;
    private VideoBaseInfoBean content;
    private VideoAuthorInfoBean author;
    private String publishTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public VideoBaseInfoBean getContent() {
        return content;
    }

    public void setContent(VideoBaseInfoBean content) {
        this.content = content;
    }

    public VideoAuthorInfoBean getAuthor() {
        return author;
    }

    public void setAuthor(VideoAuthorInfoBean author) {
        this.author = author;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
}
