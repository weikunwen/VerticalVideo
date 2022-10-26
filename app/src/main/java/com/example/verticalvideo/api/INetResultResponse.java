package com.example.verticalvideo.api;

public interface INetResultResponse<T> {
    int getCode();

    String getMessage();

    T getData();
}