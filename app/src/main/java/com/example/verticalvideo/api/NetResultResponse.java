package com.example.verticalvideo.api;

public interface NetResultResponse<T> {
    int getCode();

    String getMessage();

    T getData();
}
