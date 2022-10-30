package com.example.verticalvideo.api;

public interface IResponseListener<T> {
    void onResponseCallback(boolean success, T result, String msg, Throwable throwable);
}